# Csd Tdd Kata Practice

## Environment & Tools
- JDK 8
- IntelliJ
- git
- Maven


# Practice1：PrimeFactor Kata
这是一个分解质因数的kata练习。
## 测试用例：
```
2:[2]
3:[3]
4:[2,2]
5:[5]
6:[2,3]
7:[7]
8:[2,2,2]
```
## Step1:
- 编写单元测试：
```
assertEquals(Arrays.asList(2), primeFactor.getFactors(2));
```
- 运行不通过
- 编写测试通过的代码：
```
public class PrimeFactor {
    public <T> List<T> getFactors(int i) {
        List resList = new ArrayList();
        resList.add(2);
        return resList;
    }
}
```
- 运行通过
## Step2:
- 再编写一个测试不通过的单元测试案例：
```
assertEquals(Arrays.asList(3), primeFactor.getFactors(3));
```
- 运行，让测试不通过
- 修改代码，让单元测试案例通过：
```
public <T> List<T> getFactors(int i) {
    List resList=new ArrayList();
    resList.add(i);
    return resList;
}
```
- 重构代码
```
List<Integer> getFactors(int i) {
        List<Integer> resList = new ArrayList<>();
        resList.add(i);
        return resList;
}
```
## Step3:
- 再编写一个测试不通过的单元测试案例：
```
assertEquals(Arrays.asList(2, 2), primeFactor.getFactors(4));
```
- 修改代码，让单元测试案例通过：
```
List<Integer> getFactors(int i) {
        List<Integer> resList = new ArrayList<>();
        if (i % 2 == 0 && i != 2) {
            resList.add(2);
            i = i / 2;
        }
        resList.add(i);
        return resList;
}
```
## Step4:
- 再编写一个测试不通过的单元测试案例：
```
assertEquals(Arrays.asList(2, 2, 2), primeFactor.getFactors(8));
```
- 修改代码，让单元测试案例通过：
```
List<Integer> getFactors(int i) {
        List<Integer> resList = new ArrayList<>();
        while (i % 2 == 0 && i != 2) {
            resList.add(2);
            i = i / 2;
        }
        resList.add(i);
        return resList;
}
```
## Step5:
- 再编写一个测试不通过的单元测试案例：
```
assertEquals(Arrays.asList(3, 3), primeFactor.getFactors(9));
```
- 修改代码，让单元测试案例通过：
```
  List<Integer> getFactors(int i) {
        List<Integer> resList = new ArrayList<>();
        while (i % 2 == 0 && i != 2) {
            resList.add(2);
            i = i / 2;
        }
        while (i % 3 == 0 && i != 3) {
            resList.add(3);
            i = i / 3;
        }
        resList.add(i);
        return resList;
    }
```
## Step6:
- 再编写一个测试不通过的单元测试案例：
```
 assertEquals(Arrays.asList(2, 11, 13), primeFactor.getFactors(2 * 11 * 13));
```
- 修改代码，让单元测试案例通过：
```
List<Integer> getFactors(int factor) {
        List<Integer> resList = new ArrayList<>();
        for (int leastPrimeFactor = 2; leastPrimeFactor < factor; leastPrimeFactor++) {
            while (factor % leastPrimeFactor == 0 && factor != leastPrimeFactor) {
                resList.add(leastPrimeFactor);
                factor = factor / leastPrimeFactor;
            }
        }
        resList.add(factor);
        return resList;
}
```