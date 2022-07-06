package everyday.day6.templateMethod;

/**
 * @Description 体验囚犯的一天
 * @Author clovenine
 * @Date 2022/7/6 10:01
 */
public class Visitor {

    // 面向接口编程
    public void visit(Prisoner prisoner){
        System.out.println("----开始体验囚犯的一天----");
        prisoner.life();
        System.out.println("----体验结束了----");


        if(prisoner instanceof Star){
            // ...
        }
    }

    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        Prisoner star = new Star("ju ran shi ni");
        visitor.visit(star);
        Prisoner zs = new PoliticalPrisoner("zhenzhi");
        visitor.visit(zs);
    }

}
