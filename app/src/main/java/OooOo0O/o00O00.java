package OoooO0O;

import android.util.Log;
import com.google.android.ump.FormError;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class o00O00 extends Exception {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f13991OooOo0O;

    public o00O00(int i, String str) {
        super(str);
        this.f13991OooOo0O = i;
    }

    public final FormError OooO00o() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new FormError(this.f13991OooOo0O, super.getMessage());
    }

    public o00O00(int i, String str, IOException iOException) {
        super(str, iOException);
        this.f13991OooOo0O = i;
    }
}
