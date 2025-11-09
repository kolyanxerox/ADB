package OoooOOO;

import android.view.View;
import java.util.Comparator;
import o00OOoo.o00Oo0;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final /* synthetic */ class oO000Oo implements Comparator {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ oO000Oo f14639OooOo0o = new oO000Oo(0);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14640OooOo0O;

    public /* synthetic */ oO000Oo(int i) {
        this.f14640OooOo0O = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14640OooOo0O) {
            case 0:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 1:
                return ((String) obj).compareTo((String) obj2);
            case 2:
                return o00oO0o.OooO0Oo(((o00Oo0) obj).f32622OooO00o, ((o00Oo0) obj2).f32622OooO00o);
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
