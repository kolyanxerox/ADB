package o000O0O;

import android.os.Looper;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.OooOo00;
import o00O0oO.o000000;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0OO extends OooOo00 implements o00O0Oo.OooO0O0 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f30106OooOo0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooO0OO(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.f30106OooOo0O = i3;
    }

    @Override // o00O0Oo.OooO0O0
    public final Object invoke() {
        switch (this.f30106OooOo0O) {
            case 0:
                ((OooO0o) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                OooOo.OooO0Oo(name, "<get-threadName>(...)");
                return Boolean.valueOf(o000000.Oooo0o("Firebase Background Thread #", name));
            case 1:
                ((OooO0o) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                OooOo.OooO0Oo(name2, "<get-threadName>(...)");
                return Boolean.valueOf(o000000.Oooo0o("Firebase Blocking Thread #", name2));
            default:
                ((OooO0o) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }
}
