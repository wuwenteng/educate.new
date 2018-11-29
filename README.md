# educate.new
规范化url,返回数据体，异常处理等
在使用responseEntity返回数据时，出现中文不兼容的情况，通过设置返回头解决。
但是每个返回都要调用一次setHeader（）函数，有点麻烦，还没找到除了写filter以外的全局设置办法
