package io.flutter.plugins.webviewflutter;

import androidx.datastore.preferences.core.MutablePreferences;
import io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiRegistrar;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooOO0O implements o00O0Oo.Oooo000 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28790OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ long f28791OooOo0o;

    public /* synthetic */ OooOO0O(int i, long j) {
        this.f28790OooOo0O = i;
        this.f28791OooOo0o = j;
    }

    @Override // o00O0Oo.Oooo000
    public final Object invoke(Object obj) {
        switch (this.f28790OooOo0O) {
            case 0:
                return AndroidWebkitLibraryPigeonProxyApiRegistrar.C45051.onFinalize$lambda$0(this.f28791OooOo0o, (oo00o.OooOOO0) obj);
            default:
                ((MutablePreferences) obj).set(o000OOoO.OooOOO.f30298OooO0O0, Long.valueOf(this.f28791OooOo0o));
                return null;
        }
    }
}
