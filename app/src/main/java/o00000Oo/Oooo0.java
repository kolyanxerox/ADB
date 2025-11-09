package o00000oo;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import o000OO.OooO;

/* loaded from: classes2.dex */
public final class Oooo0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Logger f29285OooO0O0 = Logger.getLogger(Oooo0.class.getName());

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f29286OooO00o;

    public Oooo0(Oooo0 oooo0) {
        this.f29286OooO00o = new ConcurrentHashMap(oooo0.f29286OooO00o);
    }

    public final synchronized Oooo000 OooO00o(String str) {
        if (!this.f29286OooO00o.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (Oooo000) this.f29286OooO00o.get(str);
    }

    public final synchronized void OooO0O0(OooO oooO) {
        int iOooO00o = oooO.OooO00o();
        if (!(iOooO00o != 1 ? AbstractC2183w4.OooO0O0(iOooO00o) : AbstractC2183w4.OooO00o(iOooO00o))) {
            throw new GeneralSecurityException("failed to register key manager " + oooO.getClass() + " as it is not FIPS compatible.");
        }
        OooO0OO(new Oooo000(oooO));
    }

    public final synchronized void OooO0OO(Oooo000 oooo000) {
        try {
            OooO oooO = oooo000.f29287OooO00o;
            Class cls = oooO.f30157OooO0OO;
            if (!oooO.f30156OooO0O0.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + oooO.toString() + " does not support primitive class " + cls.getName());
            }
            String strOooO0O0 = oooO.OooO0O0();
            Oooo000 oooo0002 = (Oooo000) this.f29286OooO00o.get(strOooO0O0);
            if (oooo0002 != null && !oooo0002.f29287OooO00o.getClass().equals(oooo000.f29287OooO00o.getClass())) {
                f29285OooO0O0.warning("Attempted overwrite of a registered key manager for key type ".concat(strOooO0O0));
                throw new GeneralSecurityException("typeUrl (" + strOooO0O0 + ") is already registered with " + oooo0002.f29287OooO00o.getClass().getName() + ", cannot be re-registered with " + oooo000.f29287OooO00o.getClass().getName());
            }
            this.f29286OooO00o.putIfAbsent(strOooO0O0, oooo000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public Oooo0() {
        this.f29286OooO00o = new ConcurrentHashMap();
    }
}
