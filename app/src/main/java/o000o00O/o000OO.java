package o000o00o;

import android.app.Activity;
import android.content.Context;
import java.util.UUID;
import o00O0Oo.OooO0O0;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000OO implements OooO0O0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30789OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f30790OooOo0o;

    public /* synthetic */ o000OO(Object obj, int i) {
        this.f30789OooOo0O = i;
        this.f30790OooOo0o = obj;
    }

    @Override // o00O0Oo.OooO0O0
    public final Object invoke() {
        switch (this.f30789OooOo0O) {
            case 0:
                ((o00O0OO) this.f30790OooOo0o).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                kotlin.jvm.internal.OooOo.OooO0Oo(uuidRandomUUID, "randomUUID(...)");
                String string = uuidRandomUUID.toString();
                kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(...)");
                return string;
            case 1:
                OooOOo0.o0OOO0o o0ooo0o = (OooOOo0.o0OOO0o) this.f30790OooOo0o;
                Context context = (Activity) o0ooo0o.f13516OooOo;
                if (context == null) {
                    context = (Context) o0ooo0o.f13518OooOo0o;
                }
                return OooO0oO.OooOo.OooOoo0(context.getPackageName(), ".flutter.share_provider");
            default:
                return this.f30790OooOo0o;
        }
    }
}
