
实用类：

  01.枚举  enum
     Student stu=new Student();
       我们为了保证用户一个健康的输入！ 我们使用了封装特性！
       用户就不能直接访问我们的属性了！！  private  char sex;
       提供了一个对外访问的接口！  getSex()  setSex(char sex)
      在setSex()中书写我们的逻辑！如果用户输入的不健康，有默认值！
     
    001.枚举是一种数据类型，名称就是enum！
        public  class  Hello{}
        public  interface  Hello{}
        public  enum  Hello{}
    
    002.可以限定用户的输入
                虽然之前学的封装，能保证我们数据的准确性！但是阻挡不了用户的输入！
    003.所有的 枚举值   都是static final 修饰的(静态常量)
    004.构造方法必须是私有的！ 防止外部访问！
    
       

  02.基本数据类型对应的包装类（封装类）
      包装类：
      001.基本数据类型能点出来方法吗？        不能！！ 对应的包装类可以！
      002.集合中可以存放基本数据类型吗？    不能！！ 对应的包装类可以！
      003.就是把基本数据类型转换成对象！
      004.所有的包装类都是由fianl修饰的，不能创建子类
      005.在基本数据类型需要用对象来表示的时候使用
      006.jdk1.5之后，允许了基本数据类型和包装类的混合算术运算
    
      byte      Byte
      short     Short
      int       Integer
      long      Long
      float     Float
      double    Double
 上面的六种，都是数值类型！ 都继承了Number类！ 
 然后Number实现了Serializable接口！
      
      boolean   Boolean
      char      Character
 他们两个都实现 了Serializable接口！   


  如果有个方法让我们传递一个Serializable类型的参数！
  我们可不可以传递8种基本数据类型的封装类呢？    可以！

  装箱和拆箱操作  （基本数据类型和对应的包装类做转换）
        装箱：把基本数据类型转换成对应的包装类
        拆箱：把包装类转换成对应的基本数据类型


   基本数据类型中叫：  自动类型转换和 强制类型转换
   引用数据类型中叫：   向上转型和向下转型！
   
  03.Math  
      001.java.lang包下的一个算术类！
      002.是final修饰的
      003.除了构造方法之外的所有方法都是静态的！可以通过类名直接访问
  
     天花板函数
        ceil  天  向上取整
        floor 地  向下取整
        
  
   
  04.Random
       随机数
     
  05.String StringBuffer StringBuilder的区别
  
     001.在执行速度方法
        StringBuilder  >  StringBuffer   >  String
        
     002.线程安全  多线程情况下
        StringBuilder： 单线程使用，多线程不安全
        StringBuffer ： 多线程安全
              String ： 数据量小的时候使用
     003.String本身是不可变的！每当我们操作一次字符串，就会创建一个新的对象！
     StringBuilder，StringBuffer每次操作都是一个对象！

  
  06.Date   SimpleDateFormat
  
  
    
  07.Calendar
  
  
  
  
  
  