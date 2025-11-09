package androidx.emoji2.text.flatbuffer;

import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Supplier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15276OooO00o;

    public /* synthetic */ OooO00o(int i) {
        this.f15276OooO00o = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f15276OooO00o) {
            case 0:
                return Utf8Old.lambda$static$0();
            case 1:
                return new byte[8192];
            default:
                return new char[8192];
        }
    }
}
