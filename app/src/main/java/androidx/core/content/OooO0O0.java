package androidx.core.content;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Predicate {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15200OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f15201OooO0O0;

    public /* synthetic */ OooO0O0(String str, int i) {
        this.f15200OooO00o = i;
        this.f15201OooO0O0 = str;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f15200OooO00o) {
            case 0:
                return IntentSanitizer.Builder.lambda$allowExtraOutput$16(this.f15201OooO0O0, (Uri) obj);
            case 1:
                return this.f15201OooO0O0.equals((String) obj);
            case 2:
                return IntentSanitizer.Builder.lambda$allowComponentWithPackage$9(this.f15201OooO0O0, (ComponentName) obj);
            case 3:
                return IntentSanitizer.Builder.lambda$allowDataWithAuthority$8(this.f15201OooO0O0, (Uri) obj);
            case 4:
                return IntentSanitizer.Builder.lambda$allowClipDataUriWithAuthority$11(this.f15201OooO0O0, (Uri) obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtraStreamUriWithAuthority$15(this.f15201OooO0O0, (Uri) obj);
        }
    }
}
