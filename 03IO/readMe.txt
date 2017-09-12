

1.File  文件的操作

 创建文件夹（目录）
 mkdir/mkdirs
 创建文件
 createNewFile
 
 把我们自己写的功能打成jar包！
 
 
 2.IO流
   
       编码格式     gb2312  gbk  iso-8859-1    utf-8 
   
 
 
 一组有序的数据序列，我们称之为流！
 
  按照流的走向，我们分为：   输入流和输出流！
  
         源头                        参照物
   自来水公司  ======》 水龙头  ======》使用水（取水）
                      输入流                     输出流
  
      我们输入内容（文字，视频，音频，图片，java对象.....）   到  内存中=====》输入流 
  
     我们从内存中获取（文字，视频，音频，图片，java对象.....）             =====》输出流 
     
     我们所研究的流  以内存 为参照物！
     
     
  
  基类    
 
 字节流         byte字节          int类型  4个字节      中文占几个字节？  GBK  2个字节！   utf-8  3个字节！数字和字母都是一个！
    a b c = 我
    
    InputStream
   OutputStream
   都是抽象类，我们使用他们的实现类！
   


 字符流
      Reader
      Writer
      
缓冲流
     BufferedReader 
     BufferedWriter
 
 
 2进制流 （图片，视频.....）
   DataInputStream
   DataOutputStream
 
 
 序列化和反序列化
    是持久化技术中的其中一种实现方式！
 
 ObjectInputStream
 ObjectOutputStream
 
 
 
 
 
 
 
 