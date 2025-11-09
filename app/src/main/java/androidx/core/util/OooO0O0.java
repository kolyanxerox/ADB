package androidx.core.util;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Predicate {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15244OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f15245OooO0O0;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f15244OooO00o = i;
        this.f15245OooO0O0 = obj;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f15244OooO00o) {
            case 0:
                return this.f15245OooO0O0.equals(obj);
            default:
                return ((Predicate) this.f15245OooO0O0).lambda$negate$1(obj);
        }
    }
}
