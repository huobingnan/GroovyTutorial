package syntax

// 可以通过双引号创建一个字符串字面量
var name = "Tom";

// 也可以使用单引号来创建一个字符串字面量
var gender = 'Male';

// 可以使用Java的方式
var birthday = String.valueOf("2000-12-10");

// Groovy中的字符串可以使用模板的形式
// 这种方式创建的GString ： Groovy String
var descriptor = "${name}-${gender} ${birthday}";
println(descriptor);

// 使用模板创建的字符串GString，并不是String的子类
println(descriptor instanceof String);

// template string 创建之后不会再发生改变
var templateString = "Hello my name is ${name}";
// lazy string 会随着变量值得变化而变化
var lazyString = "Hello my name is ${-> name}";

println(templateString);
println(lazyString);
name = "Bob";
println(templateString);
println(lazyString);
def greet(String msg) {
    println("Hello " + msg);
}
({ ->
    def firstname = "Tom";
    def ge = "Male";
    def desc = "${firstname}-${ge}";
    greet(desc);
})()
