package o000o00o;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.ironsource.sdk.controller.OooO0o;

/* loaded from: classes2.dex */
public final class o000000O implements o000o0O0.OooOOO0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final o000o0O0.OooOOO f30742OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30743OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o000o0O0.OooOOO f30744OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final o000o0O0.OooOOO f30745OooOoO0;

    public /* synthetic */ o000000O(o000o0O0.OooOOO oooOOO, o000o0O0.OooOOO oooOOO2, o000o0O0.OooOOO oooOOO3, int i) {
        this.f30743OooOo0O = i;
        this.f30744OooOo0o = oooOOO;
        this.f30742OooOo = oooOOO2;
        this.f30745OooOoO0 = oooOOO3;
    }

    @Override // o00O00oO.o0000O0
    public final Object get() {
        switch (this.f30743OooOo0O) {
            case 0:
                Context appContext = (Context) this.f30744OooOo0o.get();
                o00O0O0O.OooOOO0 blockingDispatcher = (o00O0O0O.OooOOO0) this.f30742OooOo.get();
                o000Oo0 sessionDataSerializer = (o000Oo0) this.f30745OooOoO0.get();
                kotlin.jvm.internal.OooOo.OooO0o0(appContext, "appContext");
                kotlin.jvm.internal.OooOo.OooO0o0(blockingDispatcher, "blockingDispatcher");
                kotlin.jvm.internal.OooOo.OooO0o0(sessionDataSerializer, "sessionDataSerializer");
                DataStore dataStoreOooO0O0 = oo0o0Oo.OooO0O0(sessionDataSerializer, new ReplaceFileCorruptionHandler(new OooO0o(sessionDataSerializer, 3)), o00O0oOo.o0000OO0.OooO0O0(blockingDispatcher), new o0OO00O(appContext, 1));
                if (dataStoreOooO0O0 != null) {
                    return dataStoreOooO0O0;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new o000o0O.oo0o0Oo((o00O0O0O.OooOOO0) this.f30744OooOo0o.get(), (oo0o0O0) this.f30742OooOo.get(), (DataStore) this.f30745OooOoO0.get());
        }
    }
}
