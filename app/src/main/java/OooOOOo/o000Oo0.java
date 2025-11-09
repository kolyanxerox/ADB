package OooOooo;

import OooO0oO.OooOOO0;
import OooO0oO.OooOo;
import OooOoo0.o000OOo;
import Oooo00O.o000000O;
import Oooo00o.o000O000;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class o000Oo0 extends o000O000 {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final int DEVELOPER_ERROR = 10;

    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    public static final int UNKNOWN = -1;

    /* renamed from: OooOo0O */
    public final int f13680OooOo0O;
    private final int zzb;

    @Nullable
    private final PendingIntent zzc;

    @Nullable
    private final String zzd;

    @NonNull
    public static final o000Oo0 RESULT_SUCCESS = new o000Oo0(0);

    @NonNull
    public static final Parcelable.Creator<o000Oo0> CREATOR = new o000OOo(1);

    public o000Oo0(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f13680OooOo0O = i;
        this.zzb = i2;
        this.zzc = pendingIntent;
        this.zzd = str;
    }

    public static String OooOO0O(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return OooOo.OooO0oO(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean OooO() {
        return (this.zzb == 0 || this.zzc == null) ? false : true;
    }

    public final String OooO0o() {
        return this.zzd;
    }

    public final int OooO0o0() {
        return this.zzb;
    }

    public final PendingIntent OooO0oO() {
        return this.zzc;
    }

    public final boolean OooOO0() {
        return this.zzb == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000Oo0)) {
            return false;
        }
        o000Oo0 o000oo02 = (o000Oo0) obj;
        return this.zzb == o000oo02.zzb && o000000O.OooOO0o(this.zzc, o000oo02.zzc) && o000000O.OooOO0o(this.zzd, o000oo02.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        OooOOO0 oooOOO0 = new OooOOO0(this);
        oooOOO0.OooO00o(OooOO0O(this.zzb), "statusCode");
        oooOOO0.OooO00o(this.zzc, "resolution");
        oooOOO0.OooO00o(this.zzd, Constants.MESSAGE);
        return oooOOO0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(this.f13680OooOo0O);
        int i2 = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i2);
        o00oO0o.OooOo00(parcel, 3, this.zzc, i);
        o00oO0o.OooOo0(parcel, 4, this.zzd);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public o000Oo0(int i) {
        this(1, i, null, null);
    }

    public o000Oo0(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
