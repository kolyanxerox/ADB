package OoooOOO;

import androidx.datastore.preferences.protobuf.OooO00o;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class o00OOO00 extends oO0Oo {

    /* renamed from: OooOo, reason: collision with root package name */
    public long f14169OooOo;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public String f14170OooOoO0;

    @Override // OoooOOO.oO0Oo
    public final boolean OooOO0o() {
        Calendar calendar = Calendar.getInstance();
        this.f14169OooOo = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f14170OooOoO0 = OooO00o.OooOOO0(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long OooOOOO() {
        OooOOO0();
        return this.f14169OooOo;
    }

    public final String OooOOOo() {
        OooOOO0();
        return this.f14170OooOoO0;
    }
}
