#测试驱动开发（TDD）实例

目标：编写一个函数，返回小于给定值max的所有素数组成的数组

    public static int[] getPrimes(int max);

##目的

1. 写测试用例
2. 重构

##流程周期

思考-写测试用例 -> 运行，保证失败 -> 写just enough 的代码，让测试通过 -> 重构代码， 保持测试通过 -> 进入下一轮


##任务分解

1.边界条件

* getPrimes(0)
* getPrimes(-2)
* getPrimes(2)

2.正常输入

* getPrimes(9)
* getPrimes(17)
* getPrimes(30)