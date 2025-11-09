package o000o00o;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;

/* loaded from: classes2.dex */
public final class o000000 implements o000o0O0.OooOOO0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final o000o0O0.OooOOO f30739OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30740OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o000o0O0.OooOOO f30741OooOo0o;

    public /* synthetic */ o000000(o000o0O0.OooOOO oooOOO, o000o0O0.OooOOO oooOOO2, int i) {
        this.f30740OooOo0O = i;
        this.f30741OooOo0o = oooOOO;
        this.f30739OooOo = oooOOO2;
    }

    @Override // o00O00oO.o0000O0
    public final Object get() {
        switch (this.f30740OooOo0O) {
            case 0:
                Context appContext = (Context) this.f30741OooOo0o.get();
                o00O0O0O.OooOOO0 blockingDispatcher = (o00O0O0O.OooOOO0) this.f30739OooOo.get();
                kotlin.jvm.internal.OooOo.OooO0o0(appContext, "appContext");
                kotlin.jvm.internal.OooOo.OooO0o0(blockingDispatcher, "blockingDispatcher");
                DataStore dataStoreOooO0O0 = oo0o0Oo.OooO0O0(o000o0O.o00Oo0.f30930OooO00o, new ReplaceFileCorruptionHandler(new o0Oo0oo(0)), o00O0oOo.o0000OO0.OooO0O0(blockingDispatcher), new o0OO00O(appContext, 0));
                if (dataStoreOooO0O0 != null) {
                    return dataStoreOooO0O0;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 1:
                return new o0000O((Context) this.f30741OooOo0o.get(), (o00O0OO) this.f30739OooOo.get());
            case 2:
                return new o00O0000((oo0o0O0) this.f30741OooOo0o.get(), (o00O0OO) this.f30739OooOo.get());
            default:
                return new o000o0O.oo000o((o000o0O.o0O0O00) this.f30741OooOo0o.get(), (o000o0O.o0O0O00) this.f30739OooOo.get());
        }
    }
}
