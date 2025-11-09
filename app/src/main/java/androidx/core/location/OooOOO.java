package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15225OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15226OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f15227OooOo0o;

    public /* synthetic */ OooOOO(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Object obj, int i) {
        this.f15226OooOo0O = i;
        this.f15227OooOo0o = locationListenerTransport;
        this.f15225OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15226OooOo0O) {
            case 0:
                this.f15227OooOo0o.lambda$onLocationChanged$1((List) this.f15225OooOo);
                break;
            default:
                this.f15227OooOo0o.lambda$onLocationChanged$0((Location) this.f15225OooOo);
                break;
        }
    }
}
