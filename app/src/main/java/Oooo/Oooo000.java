package Oooo;

import Oooo000.OooO0o;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class Oooo000 extends Binder implements IInterface {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13717OooOo0O;

    public Oooo000(TaskCompletionSource taskCompletionSource) {
        this.f13717OooOo0O = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = OooOO0.f13703OooO00o;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        zzc zzcVarCreateFromParcel = parcel.readInt() == 0 ? null : zzc.CREATOR.createFromParcel(parcel);
        AppSetIdInfo appSetIdInfo = zzcVarCreateFromParcel != null ? new AppSetIdInfo(zzcVarCreateFromParcel.zzb(), zzcVarCreateFromParcel.zza()) : null;
        boolean zOooOO0 = statusCreateFromParcel.OooOO0();
        TaskCompletionSource taskCompletionSource = this.f13717OooOo0O;
        if (zOooOO0) {
            taskCompletionSource.setResult(appSetIdInfo);
            return true;
        }
        taskCompletionSource.setException(statusCreateFromParcel.OooO() ? new Oooo000.OooOOOO(statusCreateFromParcel) : new OooO0o(statusCreateFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
