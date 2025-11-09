package o000o00o;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import o00O0O0O.OooOO0;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0Oo0oo implements o00O0Oo.Oooo000 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30880OooOo0O;

    public /* synthetic */ o0Oo0oo(int i) {
        this.f30880OooOo0O = i;
    }

    @Override // o00O0Oo.Oooo000
    public final Object invoke(Object obj) {
        switch (this.f30880OooOo0O) {
            case 0:
                CorruptionException ex = (CorruptionException) obj;
                kotlin.jvm.internal.OooOo.OooO0o0(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return o000o0O.o00Oo0.f30931OooO0O0;
            case 1:
                return Boolean.valueOf(obj == null);
            case 2:
                OooOO0 oooOO0 = (OooOO0) obj;
                if (oooOO0 instanceof o00O0oOo.o0000O00) {
                    return (o00O0oOo.o0000O00) oooOO0;
                }
                return null;
            default:
                return 1000L;
        }
    }
}
