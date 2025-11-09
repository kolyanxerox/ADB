package androidx.core.content;

import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Predicate {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15202OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f15203OooO0O0;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f15202OooO00o = i;
        this.f15203OooO0O0 = obj;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f15202OooO00o) {
            case 0:
                return ((ComponentName) this.f15203OooO0O0).equals((ComponentName) obj);
            default:
                return UriMatcherCompat.lambda$asPredicate$0((UriMatcher) this.f15203OooO0O0, (Uri) obj);
        }
    }
}
