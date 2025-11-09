package o000o00o;

import android.content.Context;
import android.view.View;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import io.flutter.util.ViewUtils;
import java.io.IOException;
import o000O0Oo.OooO0o;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00000O0 implements o0000oo0.o00oO0o, ViewUtils.ViewVisitor, o00Oo000.o0Oo0oo, o00Oo000.oo0o0Oo, o00Oo000.o0OO00O {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f30746OooOo0O;

    public /* synthetic */ o00000O0(int i) {
        this.f30746OooOo0O = i;
    }

    @Override // o00Oo000.o0OO00O
    public Object OooO00o(o00Oo00o.o000oOoO o000oooo2) {
        return o00Oo00o.Oooo0.f32672OooOo0O;
    }

    public o000OOO.OooOO0O OooO0O0(Context context, o000Oo0O.OooOo00 oooOo00) {
        switch (this.f30746OooOo0O) {
            case 3:
                return new o000OOO.OooOO0O(context, oooOo00);
            default:
                return new o000o0oo.o00Ooo(context, oooOo00);
        }
    }

    @Override // o0000oo0.o00oO0o
    public Object OooO0OO(OooO0o oooO0o) {
        return FirebaseSessionsRegistrar.getComponents$lambda$1(oooO0o);
    }

    public o000Oo0O.OooOo00 OooO0Oo(Context context) {
        switch (this.f30746OooOo0O) {
            case 1:
                return new o000Oo0O.OooOo00(context);
            default:
                return new o000o0oo.o00O0O(context);
        }
    }

    @Override // o00Oo000.o0Oo0oo
    public void accept(Object obj) throws IOException {
        switch (this.f30746OooOo0O) {
            case 6:
                throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
            default:
                throw ((IOException) obj);
        }
    }

    @Override // io.flutter.util.ViewUtils.ViewVisitor
    public boolean run(View view) {
        return view.hasFocus();
    }
}
