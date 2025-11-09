package o00O00o0;

import android.view.View;
import io.flutter.util.ViewUtils;
import o00Oo000.o0OO00O;
import o00Oo00o.o000oOoO;
import o00Oo00o.o0OoOo0;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements ViewUtils.ViewVisitor, o0OO00O {

    /* renamed from: OooOo0O */
    public final /* synthetic */ Object f31305OooOo0O;

    public /* synthetic */ OooO00o(Object obj) {
        this.f31305OooOo0O = obj;
    }

    @Override // o00Oo000.o0OO00O
    public Object OooO00o(o000oOoO o000oooo2) {
        return (o0OoOo0) this.f31305OooOo0O;
    }

    @Override // io.flutter.util.ViewUtils.ViewVisitor
    public boolean run(View view) {
        return ViewUtils.lambda$hasChildViewOfType$1((Class[]) this.f31305OooOo0O, view);
    }
}
