package o0000o0O;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o0000oO0.Oooo000;

/* loaded from: classes2.dex */
public final class OooO {

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final String[] f29611OooO0oO = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final SimpleDateFormat f29612OooO0oo = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29613OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29614OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f29615OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Date f29616OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f29617OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f29618OooO0o0;

    public OooO(String str, String str2, String str3, Date date, long j, long j2) {
        this.f29613OooO00o = str;
        this.f29614OooO0O0 = str2;
        this.f29615OooO0OO = str3;
        this.f29616OooO0Oo = date;
        this.f29618OooO0o0 = j;
        this.f29617OooO0o = j2;
    }

    public final Oooo000 OooO00o() {
        Oooo000 oooo000 = new Oooo000();
        oooo000.f29626OooO00o = "frc";
        oooo000.f29637OooOOO0 = this.f29616OooO0Oo.getTime();
        oooo000.f29627OooO0O0 = this.f29613OooO00o;
        oooo000.f29628OooO0OO = this.f29614OooO0O0;
        String str = this.f29615OooO0OO;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        oooo000.f29629OooO0Oo = str;
        oooo000.f29631OooO0o0 = this.f29618OooO0o0;
        oooo000.f29634OooOO0 = this.f29617OooO0o;
        return oooo000;
    }
}
