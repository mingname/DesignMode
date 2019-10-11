package design.cn.xqm.hoperun.designmode.component;

/**
 * Created by xueqiaoming on 2019/10/11.
 */

public class Test {
    public void testDemo(){
        Firm head = new BranchFirm("深圳XX集团有限公司");//公司总部
        head.append(new MarketDepartment("深圳XX集团有限公司--市场部"));
        head.append(new MinTechDepartment("深圳XX集团有限公司--技术部"));

        Firm jsFirm = new BranchFirm("深圳XX集团有限公司-江苏分公司");
        jsFirm.append(new MarketDepartment("深圳XX集团有限公司--江苏分公司市场部"));
        jsFirm.append(new MinTechDepartment("深圳XX集团有限公司--江苏分公司技术部"));

        Firm szFirm = new BranchFirm("深圳XX集团有限公司-江苏分公司-苏州办事处");
        szFirm.append(new MinTechDepartment("深圳XX集团有限公司-江苏分公司-苏州办事处技术部"));
        szFirm.append(new MarketDepartment("深圳XX集团有限公司-江苏分公司-苏州办事处市场部"));

        jsFirm.append(szFirm);
        //如果还需要新增分公司或办事处等，就继续按照上述操作处理
        head.append(jsFirm);
        head.show(0);
    }
//    public static void main(String[] args){
//        Firm head = new BranchFirm("深圳XX集团有限公司");//公司总部
//        head.append(new MarketDepartment("深圳XX集团有限公司--市场部"));
//        head.append(new MinTechDepartment("深圳XX集团有限公司--技术部"));
//
//        Firm jsFirm = new BranchFirm("深圳XX集团有限公司-江苏分公司");
//        jsFirm.append(new MarketDepartment("深圳XX集团有限公司--江苏分公司市场部"));
//        jsFirm.append(new MinTechDepartment("深圳XX集团有限公司--江苏分公司技术部"));
//
//        Firm szFirm = new BranchFirm("深圳XX集团有限公司-江苏分公司-苏州办事处");
//        szFirm.append(new MinTechDepartment("深圳XX集团有限公司-江苏分公司-苏州办事处技术部"));
//        szFirm.append(new MarketDepartment("深圳XX集团有限公司-江苏分公司-苏州办事处市场部"));
//
//        jsFirm.append(szFirm);
//        //如果还需要新增分公司或办事处等，就继续按照上述操作处理
//        head.append(jsFirm);
//        head.show(0);
//    }
}
