XML: 可扩展标记语言！
   01.很象html（超文本标记语言）
   02.着重于数据的保存，不专注显示！
   03.无需预编译
   04.符合W3C标准
   

可扩展：我们可以自定义！按照我们自己的规则来定义！

  
标记：计算机所能认识的信息符号！  int  a=5;  可以通过a找到5 ！  a就是我们的标记！

      我们每个人都有一本书，书都是一致的！ 有一个教材编号 是每个书唯一的标记！
           
W3C :万维网联盟组织！



xml文件注意点：
  01.节点要成对出现  有开放标签 和闭合标签
  <学校></学校>
  02.节点需要正确的嵌套
  <学校>
      <班级>
  </学校>
      </班级>
  03.在xml文件中  只能有一个根节点
  04.严格区分大小写
  
  
xml的节点结构，我们称之为dom树！
DOM：（Document  Object Model）文档对象模型！  
  我们整个xml文件的节点就是一个  倒挂的dom树！ 只有一个根！
  
  
 特殊字符：
 >     &gt;
 <     &lt;
 &     &amp;
 '     &apos;
 "     &quot;
  
如果说 我有一大篇 文字   很多地方都有特殊字符！ 一个一个替换很麻烦！
使用CDATA:不被xml文件解析器解析！

<![CDATA[内容]]>



DTD文件：针对于xml文件的约束文件！


比如说我们写了一个DTD文件，规定了 只能有一个School根节点！
   
School根节点下只能有Grade节点，可以有多个！
Grade节点下只能有多个Class节点
Class节点只能有多个Teacher节点
Teacher节点只能有多个Stduent节点

上面的内容就是 约束 ！

<School>
    <Grade>   
        <Class> 
            <Teacher>
                 <Student></Student>
             </Teahcer>
        </Class>
    </Grade>
    
    <Grade>
        <Class> 
            <Teacher>
                 <Student></Student>
             </Teahcer>
        </Class>
    </Grade>
</School>



DTD文件中的注意点
  
01. <!ELEMENT package (result-types?, interceptors+, action*)>
package节点下可以有result-types    interceptors     action这三个节点


02.(result-types?, interceptors+, action*)
  result-types必须位于第一位
  interceptors必须位于第二位    
  action必须位于第三位 

03.  result-types?
   ？:指的是 result-types可以有一个，也可以没有
 
04.  interceptors+
    至少有一个 interceptors

05.action*
   可以有N个，也可以没有  


比如我们现在有一个叫   work.dtd文件

我的xml中引入
<!DOCTYPE  work SYSTEM"work.dtd">




解析xml文件
01.DOM :基于xml文档树结构的解析，把文件中的内容全部读取到内存中，比较占内存，消耗资源多！
02.SAX :基于事件的解析！不会把数据保存在内存中，占用资源小！
03.JDOM：针对于java的特定模型！满足2 8原则！自身没有解析器，依赖于SAX2的解析器！
04.DOM4J:是JDOM的一个分支！源码开放，性能优异，功能强大！




























































