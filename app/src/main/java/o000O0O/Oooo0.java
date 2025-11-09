package o000o0O;

import android.net.Uri;
import java.net.URL;
import o000o00o.OooOO0O;

/* loaded from: classes2.dex */
public final class Oooo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000o00o.OooOOO0 f30917OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O0O.OooOOO0 f30918OooO0O0;

    public Oooo0(o000o00o.OooOOO0 appInfo, o00O0O0O.OooOOO0 blockingDispatcher) {
        kotlin.jvm.internal.OooOo.OooO0o0(appInfo, "appInfo");
        kotlin.jvm.internal.OooOo.OooO0o0(blockingDispatcher, "blockingDispatcher");
        this.f30917OooO00o = appInfo;
        this.f30918OooO0O0 = blockingDispatcher;
    }

    public static final URL OooO00o(Oooo0 oooo0) {
        oooo0.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        o000o00o.OooOOO0 oooOOO0 = oooo0.f30917OooO00o;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(oooOOO0.f30695OooO00o).appendPath("settings");
        OooOO0O oooOO0O = oooOOO0.f30698OooO0Oo;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", oooOO0O.f30684OooO0OO).appendQueryParameter("display_version", oooOO0O.f30683OooO0O0).build().toString());
    }
}
