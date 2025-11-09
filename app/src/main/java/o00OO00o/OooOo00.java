package o00OO00o;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.TimeUnit;
import o00OO000.o00oO0o;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes3.dex */
public abstract class OooOo00 {

    /* renamed from: OooO00o */
    public static final String f32007OooO00o;

    /* renamed from: OooO0O0 */
    public static final long f32008OooO0O0;

    /* renamed from: OooO0OO */
    public static final int f32009OooO0OO;

    /* renamed from: OooO0Oo */
    public static final int f32010OooO0Oo;

    /* renamed from: OooO0o */
    public static final OooOO0O f32011OooO0o;

    /* renamed from: OooO0o0 */
    public static final long f32012OooO0o0;

    static {
        String property;
        int i = o00oO0o.f31965OooO00o;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f32007OooO00o = property;
        f32008OooO0O0 = o00OO000.OooO00o.OooO("kotlinx.coroutines.scheduler.resolution.ns", PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 1L, LocationRequestCompat.PASSIVE_INTERVAL);
        int i2 = o00oO0o.f31965OooO00o;
        if (i2 < 2) {
            i2 = 2;
        }
        f32009OooO0OO = o00OO000.OooO00o.OooOO0(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f32010OooO0Oo = o00OO000.OooO00o.OooOO0(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f32012OooO0o0 = TimeUnit.SECONDS.toNanos(o00OO000.OooO00o.OooO("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, LocationRequestCompat.PASSIVE_INTERVAL));
        f32011OooO0o = OooOO0O.f32001OooO00o;
    }
}
