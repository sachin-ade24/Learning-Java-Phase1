package coreJavaConcepts;

import package1.CentralTrafficRules;
import package1.GlobalTrafficRuleFromPackage1;
import package2.GlobalTrafficRule;

public class IndianTrafficRules implements CentralTrafficRules, GlobalTrafficRule, GlobalTrafficRuleFromPackage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndianTrafficRules indianObj = new IndianTrafficRules();
		CentralTrafficRules centralObj =  new IndianTrafficRules();
		GlobalTrafficRule globalObj = new IndianTrafficRules();
		GlobalTrafficRuleFromPackage1 globalP1Obj = new IndianTrafficRules();
		
		// indianObj.indianTrafficRulesMethod1();
		// indianTrafficRulesMethod2();
		// System.out.println(indianObj.interfaceMethod2());
		
		indianObj.indianTrafficRulesMethod1();
		indianTrafficRulesMethod2();
		
		// methods from interface can be called by both objects
		System.out.println(indianObj.interfaceMethod2()); // allowed
		System.out.println(centralObj.interfaceMethod2()); // allowed
		
		// Static method from an interface, does not need an object to call it
		CentralTrafficRules.interfaceMethod1("centralTrafficRules");
		System.out.println(CentralTrafficRules.interfaceMethod1("centralTrafficRules"));
		
		globalObj.trainSymbolMethod();
		
		globalP1Obj.horseCartSymbolMethod();
	}
	
	public void indianTrafficRulesMethod1() {
		System.out.println("This is 'indianTrafficRulesMethod1' interface.");
	}
	
	public static void indianTrafficRulesMethod2() {
		System.out.println("This is 'indianTrafficRulesMethod2' interface.");
	}

	@Override
	public int interfaceMethod2() {
		// TODO Auto-generated method stub
		System.out.println("This is 'interfaceMethod2' interface.");
		return 0;
	}

	@Override
	public String interfaceMethod3(String rule) {
		// TODO Auto-generated method stub
		rule = "Rules are not defined yet.";
		System.out.println("This is 'interfaceMethod3' interface and " + rule);
		return rule;
	}

	@Override
	public boolean interfaceMethod4(String newRule, boolean yOrN) {
		// TODO Auto-generated method stub
		System.out.println("This is 'interfaceMethod2' interface.");
		return false;
	}

	@Override
	public void greenGo(String r1) {
		// TODO Auto-generated method stub
		System.out.println("This is 'greenGo' interface implementation.");
	}

	@Override
	public void redStop(int i1) {
		// TODO Auto-generated method stub
		System.out.println("This is 'redStop' interface implementation.");
	}

	@Override
	public void yellowWarning() {
		// TODO Auto-generated method stub
		System.out.println("This is 'yellowWarning' interface implementation.");
	}

	@Override
	public void trainSymbolMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is Global traffic Rule method");
	}

	@Override
	public void horseCartSymbolMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is Global traffic Rule method from package1");
	}

	@Override
	public void interfaceMethod1() {
		// TODO Auto-generated method stub
		System.out.println("interfaceMethod1");
	}

	@Override
	public void interfaceMethod4() {
		// TODO Auto-generated method stub
		System.out.println("interfaceMethod4");
	}

}
