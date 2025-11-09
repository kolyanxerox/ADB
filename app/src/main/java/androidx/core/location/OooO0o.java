package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Location f15215OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15216OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Consumer f15217OooOo0o;

    public /* synthetic */ OooO0o(Consumer consumer, Location location, int i) {
        this.f15216OooOo0O = i;
        this.f15217OooOo0o = consumer;
        this.f15215OooOo = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15216OooOo0O) {
            case 0:
                this.f15217OooOo0o.accept(this.f15215OooOo);
                break;
            default:
                this.f15217OooOo0o.accept(this.f15215OooOo);
                break;
        }
    }
}
