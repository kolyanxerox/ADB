package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.vi */
/* loaded from: classes2.dex */
public final class C2160vi extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C2160vi> CREATOR = new C1569fi(4);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public ParcelFileDescriptor f24981OooOo0O;
    private Parcelable zzb = null;
    private boolean zzc = true;

    public C2160vi(ParcelFileDescriptor parcelFileDescriptor) {
        this.f24981OooOo0O = parcelFileDescriptor;
    }

    public final Oooo00o.o000Oo0 OooO0o0(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.f24981OooOo0O == null) {
                zzo.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f24981OooOo0O));
            try {
                try {
                    int i = dataInputStream.readInt();
                    byte[] bArr = new byte[i];
                    dataInputStream.readFully(bArr, 0, i);
                    Oooo0OO.o00oO0o.OooO0Oo(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i);
                        parcelObtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    zzo.zzh("Could not read from parcel file descriptor", e);
                    Oooo0OO.o00oO0o.OooO0Oo(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                Oooo0OO.o00oO0o.OooO0Oo(dataInputStream);
                throw th2;
            }
        }
        return (Oooo00o.o000Oo0) this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f24981OooOo0O == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        AbstractC2200wl.f25321OooO00o.execute(new wp0(10, autoCloseOutputStream, bArrMarshall));
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e) {
                        e = e;
                        zzo.zzh("Error transporting the ad response", e);
                        zzv.zzp().OooO0oo("LargeParcelTeleporter.pipeData.2", e);
                        Oooo0OO.o00oO0o.OooO0Oo(autoCloseOutputStream);
                        this.f24981OooOo0O = parcelFileDescriptor;
                        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
                        o00Oo0oo.o00oO0o.OooOo00(parcel, 2, this.f24981OooOo0O, i);
                        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                }
                this.f24981OooOo0O = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iOooOoO2 = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 2, this.f24981OooOo0O, i);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO2);
    }
}
