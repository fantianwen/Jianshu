##简书app的界面模仿
###一、整体界面架构层面
>1、多层fragment的架构的实现  ；   
>2、singleton的普遍使用，使用抽象工厂；   
>3、android studio中引入三方库的一般性方法：  
>>  
![lib0](https://github.com/fantianwen/MarkDown/raw/master/how2alignLib/lib0.png)  
![lib1](https://github.com/fantianwen/MarkDown/raw/master/how2alignLib/lib1.png)   
![lib2](https://github.com/fantianwen/MarkDown/raw/master/how2alignLib/lib2.png)                   



 

###二、出现的问题及解决
>1、` View view = ViewUtils.inflate(getActivity(), R.layout.base_view_aspects);`
中不要使用mContext，会出现NUllPointException，使用getActivity()；  
2、<pre>
        indicator = (TabPageIndicator) view.findViewById(R.id.indicator);
        pager = (ViewPager) view.findViewById(R.id.pager);
        tabPageIndicatorAdapter=new TabPageIndicatorAdapter(getFragmentManager());
        pager.setAdapter(tabPageIndicatorAdapter);
        /**这里需要最后进行关联*/
        indicator.setViewPager(pager);</pre>    
3、进入子fragment的ProgressBar的实现（使用动画就好了，复杂的好难！）