package OoooO0O;

import android.os.Handler;
import android.webkit.WebView;
import o00000oO.OooOOO0;

/* loaded from: classes2.dex */
public final class o00000O0 extends WebView {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f13915OooOoO0 = 0;

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f13916OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Handler f13917OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o0000Ooo f13918OooOo0o;

    public o00000O0(o00000O o00000o, Handler handler, o0000Ooo o0000ooo) {
        super(o00000o);
        this.f13916OooOo = false;
        this.f13917OooOo0O = handler;
        this.f13918OooOo0o = o0000ooo;
    }

    public final void OooO00o(String str, String str2) {
        this.f13917OooOo0O.post(new OooOOO0(3, this, str + "(" + str2 + ");"));
    }
}
