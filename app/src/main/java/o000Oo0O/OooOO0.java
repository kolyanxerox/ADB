package o000OO0o;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class OooOO0 implements o000OO00.OooOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final SimpleDateFormat f30219OooO00o;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f30219OooO00o = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // o000OO00.OooO00o
    public final void OooO00o(Object obj, Object obj2) {
        ((o000OO00.OooOO0O) obj2).OooO00o(f30219OooO00o.format((Date) obj));
    }
}
