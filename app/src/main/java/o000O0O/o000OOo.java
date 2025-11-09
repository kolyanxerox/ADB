package o000o0o;

import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000OOo implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30953OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TestSuiteActivity f30954OooOo0o;

    public /* synthetic */ o000OOo(TestSuiteActivity testSuiteActivity, int i) {
        this.f30953OooOo0O = i;
        this.f30954OooOo0o = testSuiteActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30953OooOo0O) {
            case 0:
                TestSuiteActivity.m10688a(this.f30954OooOo0o);
                break;
            default:
                TestSuiteActivity.m10690b(this.f30954OooOo0o);
                break;
        }
    }
}
