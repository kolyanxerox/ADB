package OoooOOO;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class oO0O000 extends oO0Oo0o0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final o0O0o0 f14703OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final HashMap f14704OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final o0O0o0 f14705OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final o0O0o0 f14706OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final o0O0o0 f14707OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final o0O0o0 f14708OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final o0O0o0 f14709OooOooo;

    public oO0O000(oOO0000 ooo0000) {
        super(ooo0000);
        this.f14704OooOoO0 = new HashMap();
        o0O o0o = ((o0OO0oO0) this.f14574OooOo0O).f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        this.f14703OooOoO = new o0O0o0(o0o, "last_delete_stale", 0L);
        o0O o0o2 = ((o0OO0oO0) this.f14574OooOo0O).f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o2);
        this.f14705OooOoOO = new o0O0o0(o0o2, "last_delete_stale_batch", 0L);
        o0O o0o3 = ((o0OO0oO0) this.f14574OooOo0O).f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o3);
        this.f14707OooOoo0 = new o0O0o0(o0o3, "backoff", 0L);
        o0O o0o4 = ((o0OO0oO0) this.f14574OooOo0O).f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o4);
        this.f14706OooOoo = new o0O0o0(o0o4, "last_upload", 0L);
        o0O o0o5 = ((o0OO0oO0) this.f14574OooOo0O).f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o5);
        this.f14708OooOooO = new o0O0o0(o0o5, "last_upload_attempt", 0L);
        o0O o0o6 = ((o0OO0oO0) this.f14574OooOo0O).f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o6);
        this.f14709OooOooo = new o0O0o0(o0o6, "midnight_offset", 0L);
    }

    public final Pair OooOOOO(String str) {
        AdvertisingIdClient.Info advertisingIdInfo;
        oO0 oo0;
        OooOO0O();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0oo0oo0.f14527Oooo000.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f14704OooOoO0;
        oO0 oo02 = (oO0) map.get(str);
        if (oo02 != null && jElapsedRealtime < oo02.f14601OooO0OO) {
            return new Pair(oo02.f14599OooO00o, Boolean.valueOf(oo02.f14600OooO0O0));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        o0O000 o0o000 = o0O000O.f14226OooO0O0;
        o00O0OO o00o0oo = o0oo0oo0.f14519OooOoO0;
        long jOooOOo = o00o0oo.OooOOo(str, o0o000) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(o0oo0oo0.f14516OooOo0O);
            } catch (PackageManager.NameNotFoundException unused) {
                if (oo02 != null && jElapsedRealtime < oo02.f14601OooO0OO + o00o0oo.OooOOo(str, o0O000O.f14227OooO0OO)) {
                    return new Pair(oo02.f14599OooO00o, Boolean.valueOf(oo02.f14600OooO0O0));
                }
                advertisingIdInfo = null;
            }
        } catch (Exception e) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14401Oooo00o.OooO0OO(e, "Unable to get advertising id");
            oo0 = new oO0(jOooOOo, "", false);
        }
        if (advertisingIdInfo == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = advertisingIdInfo.getId();
        oo0 = id != null ? new oO0(jOooOOo, id, advertisingIdInfo.isLimitAdTrackingEnabled()) : new oO0(jOooOOo, "", advertisingIdInfo.isLimitAdTrackingEnabled());
        map.put(str, oo0);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(oo0.f14599OooO00o, Boolean.valueOf(oo0.f14600OooO0O0));
    }

    public final String OooOOOo(String str, boolean z) throws NoSuchAlgorithmException {
        OooOO0O();
        String str2 = z ? (String) OooOOOO(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestOooOoo0 = oOO00OO.OooOoo0();
        if (messageDigestOooOoo0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestOooOoo0.digest(str2.getBytes())));
    }

    @Override // OoooOOO.oO0Oo0o0
    public final void OooOOO() {
    }
}
