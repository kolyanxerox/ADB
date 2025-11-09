package androidx.emoji2.text.flatbuffer;

import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 extends ThreadLocal {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15277OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Supplier f15278OooO0O0;

    public /* synthetic */ OooO0O0(Supplier supplier, int i) {
        this.f15277OooO00o = i;
        this.f15278OooO0O0 = supplier;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f15277OooO00o) {
            case 0:
                ((OooO00o) this.f15278OooO0O0).getClass();
                return Utf8Old.lambda$static$0();
            case 1:
                ((OooO00o) this.f15278OooO0O0).getClass();
                return new byte[8192];
            default:
                ((OooO00o) this.f15278OooO0O0).getClass();
                return new char[8192];
        }
    }
}
