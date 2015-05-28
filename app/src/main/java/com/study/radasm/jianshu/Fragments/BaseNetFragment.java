package com.study.radasm.jianshu.Fragments;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.study.radasm.jianshu.Enums.LoadStatus;
import com.study.radasm.jianshu.R;
import com.study.radasm.jianshu.common.ViewUtils;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * 带网络请求的基类
 * <p/>
 * Created by RadAsm on 15/5/27.
 */
public abstract class BaseNetFragment extends BaseFragment {


    private FrameLayout mFrameLayout;
    private NetHandler mNetHandler;

    private class NetHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            LoadStatus status = (LoadStatus) msg.obj;
            int status_code = status.getStatus_code();
            switch (status_code){
                case 1://success
                    mFrameLayout.removeAllViews();
                    mFrameLayout.addView(loadSuccessView());
                    break;
                case 2://failure
                    mFrameLayout.removeAllViews();
                    mFrameLayout.addView(loadFailureView());
                    break;
                case 3://unknown
                    mFrameLayout.removeAllViews();
                    mFrameLayout.addView(loadUnknownView());
                    break;
                default:
                    break;
            }
        }
    }

    public BaseNetFragment(){
        super();
    }



    @Override
    protected View initView() {
        mNetHandler=new NetHandler();
        mFrameLayout = new FrameLayout(getActivity());

        mFrameLayout.addView(previousView());
        netAfterView();

        return mFrameLayout;
    }


    /**访问网络之后获取的View*/
    private void netAfterView() {

        new Thread(){
            @Override
            public void run() {
                LoadStatus loadStatus = visitWeb();

                Message msg = Message.obtain();
                msg.obj=loadStatus;
                mNetHandler.sendMessage(msg);

            }
        }.start();

    }

    /**获取不可知*/
    private View loadUnknownView() {
        return loadFailureView();
    }

    /**网络访问错误*/
    private View loadFailureView() {
        View failureView = ViewUtils.inflate(getActivity(),R.layout.base_failure_view);
        return failureView;
    }

    protected abstract View loadSuccessView();

    protected abstract LoadStatus visitWeb();




    private View previousView() {
        View previousView = ViewUtils.inflate(getActivity(), R.layout.base_progress_view);
        initPreviousView(previousView);

        return previousView;
    }


    /**
     * ************************************************
     */
    private CircleImageView bg;
    private ProgressBar pb;
    private ScaleAnimation scaleAnimation;
    private AlphaAnimation alphaAnimation;
    private AnimationSet animationSet;

    /**
     * 初始化进入fragment的进度条界面
     */
    private void initPreviousView(View view) {
        bg = (CircleImageView) view.findViewById(R.id.bg);
        pb = (ProgressBar) view.findViewById(R.id.pb);
        pb.setVisibility(View.GONE);

        initAnimation();

        bg.startAnimation(animationSet);
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                pb.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }

    private void initAnimation() {
        scaleAnimation = new ScaleAnimation(0.0f, 1f, 0.0f, 1f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(2000);
        scaleAnimation.setFillAfter(true);
        /**赋值为0表示不会重复，只做一遍动画*/
        scaleAnimation.setRepeatCount(0);


        alphaAnimation = new AlphaAnimation(0, 1f);
        alphaAnimation.setDuration(2000);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setRepeatCount(0);

        animationSet = new AnimationSet(false);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);


    }

}