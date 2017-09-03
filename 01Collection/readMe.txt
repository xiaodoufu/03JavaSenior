之前我们学过    数组：
   数组的特点： 
       01.  长度一旦被定义，不允许被改变
       02.  在内存中开辟一连串连续的空间！

那么现在有一个需求：
   让我们定义一个数组  来 保存  新闻信息！！！
   
   问题：
      01.如果定义一个数组 长度为50
                   今天的新闻数量只有10条！ 那么有40个空间被浪费掉了！
      02.今天的新闻数量只有100条！ 那么无法存放多余的50条信息！
           
           
           
在程序的运行过程中，我们不知道需要多少个对象的时候，我们首选集合！！！

 集合框架！
  Vector
  List
  Set
  Map
  
 java中的集合框架是 jdk给我们提供好的一些列接口或者类的集合！
   他们都存在于  java.util包中！ 
  
  
  public interface List<E> extends Collection<E>
  public interface Set<E> extends Collection<E>
  
  public interface Map<K,V> 
  
  
 通过观看底层代码 得知：
 
 List   Set 接口都 继承了Collection接口！
   Collection接口中存储的都是不唯一（可以重复），无序的对象！
        List接口中存储的都是不唯一（可以重复），有序（插入顺序）的对象！
                     常用的实现类
                 ArrayList
                 LinkedList
        Set接口中存储的都是唯一（不可以重复），无序的对象！
                       常用的实现类
                 HashSet
                 TreeSet
                 
 Map是单独的接口！
   Map接口存储的是一组键值对(key , value)！key是不允许重复的！
              常用的实现类
              HashMap
              TreeMap
              
  
  
  接口不能被实例化！
  所以我们刚才看到的  List   Set   Map 都应该有对应的实现类！
  我们使用的时候肯定是使用实现类！或者使用多态！
  父类引用指向子类的对象！
  
  
  学数组的时候有没有工具类？？？  Arrays
  
  现在集合中 也有工具类                     Collections 
  
  
  
  
  
  
  10
  
0 0 0 0 1 0 1 0   
  
  
  
  
  
  
  
  
  
  
  
  
  



















































































