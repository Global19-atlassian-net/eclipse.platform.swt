package org.eclipse.swt.internal.cocoa;

public class NSInvocationOperation extends NSOperation {

public NSInvocationOperation() {
	super();
}

public NSInvocationOperation(int id) {
	super(id);
}

public id initWithInvocation(NSInvocation inv) {
	int result = OS.objc_msgSend(this.id, OS.sel_initWithInvocation_1, inv != null ? inv.id : 0);
	return result != 0 ? new id(result) : null;
}

public id initWithTarget(id target, int sel, id arg) {
	int result = OS.objc_msgSend(this.id, OS.sel_initWithTarget_1selector_1object_1, target != null ? target.id : 0, sel, arg != null ? arg.id : 0);
	return result != 0 ? new id(result) : null;
}

public NSInvocation invocation() {
	int result = OS.objc_msgSend(this.id, OS.sel_invocation);
	return result != 0 ? new NSInvocation(result) : null;
}

public id result() {
	int result = OS.objc_msgSend(this.id, OS.sel_result);
	return result != 0 ? new id(result) : null;
}

}
