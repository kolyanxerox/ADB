package OoooOOO;

import OooOooo.o000O;
import OooOooo.o000OO00;
import Oooo00O.o000000O;
import Oooo0OO.o00oO0o;
import Oooo0OO.oo000o;
import OoooO0O.o00000OO;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.o0OO00O;
import com.google.android.gms.internal.measurement.o0Oo0oo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import o00000oO.OooOOO0;

/* loaded from: classes2.dex */
public final class o0OOo000 extends o0Oo0oo implements o0O000o0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public String f14567OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final oOO0000 f14568OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Boolean f14569OooOo0o;

    public o0OOo000(oOO0000 ooo0000) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        o000000O.OooO0oo(ooo0000);
        this.f14568OooOo0O = ooo0000;
        this.f14567OooOo = null;
    }

    @Override // com.google.android.gms.internal.measurement.o0Oo0oo
    public final boolean OooO(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        oOO0000 ooo0000 = this.f14568OooOo0O;
        ArrayList arrayList = null;
        o0OoO00O o0o00 = null;
        o0O00O o0o00o0o = null;
        switch (i) {
            case 1:
                o00OOOOo o00ooooo = (o00OOOOo) o0OO00O.OooO00o(parcel, o00OOOOo.CREATOR);
                oOO0 ooo0 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                o0000o0(o00ooooo, ooo0);
                parcel2.writeNoException();
                return true;
            case 2:
                oOO000o ooo000o = (oOO000o) o0OO00O.OooO00o(parcel, oOO000o.CREATOR);
                oOO0 ooo02 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                o0O0O00(ooo000o, ooo02);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                oOO0 ooo03 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                OooOo0O(ooo03);
                parcel2.writeNoException();
                return true;
            case 5:
                o00OOOOo o00ooooo2 = (o00OOOOo) o0OO00O.OooO00o(parcel, o00OOOOo.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                o0OO00O.OooO0Oo(parcel);
                o000000O.OooO0oo(o00ooooo2);
                o000000O.OooO0o0(string);
                o000O0O0(string, true);
                o000O0o0(new o00000OO(this, o00ooooo2, string));
                parcel2.writeNoException();
                return true;
            case 6:
                oOO0 ooo04 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                Oooo0oO(ooo04);
                parcel2.writeNoException();
                return true;
            case 7:
                oOO0 ooo05 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                z = parcel.readInt() != 0;
                o0OO00O.OooO0Oo(parcel);
                o000OO0O(ooo05);
                String str = ooo05.zza;
                o000000O.OooO0oo(str);
                try {
                    List<oOO00> list2 = (List) ooo0000.OooO0O0().OooOOo(new o0OO(this, str)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (oOO00 ooo00 : list2) {
                        if (z || !oOO00OO.Oooo00o(ooo00.f14779OooO0OO)) {
                            arrayList2.add(new oOO000o(ooo00));
                        }
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    ooo0000.OooO00o().f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(ooo05.zza), "Failed to get user properties. appId", e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                    ooo0000.OooO00o().f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(ooo05.zza), "Failed to get user properties. appId", e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                o00OOOOo o00ooooo3 = (o00OOOOo) o0OO00O.OooO00o(parcel, o00OOOOo.CREATOR);
                String string2 = parcel.readString();
                o0OO00O.OooO0Oo(parcel);
                byte[] bArrO0000OO = o0000OO(o00ooooo3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrO0000OO);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                o0OO00O.OooO0Oo(parcel);
                o0000Ooo(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                oOO0 ooo06 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                String strO000O0Oo = o000O0Oo(ooo06);
                parcel2.writeNoException();
                parcel2.writeString(strO000O0Oo);
                return true;
            case 12:
                o00O0OO0 o00o0oo0 = (o00O0OO0) o0OO00O.OooO00o(parcel, o00O0OO0.CREATOR);
                oOO0 ooo07 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                o0000Oo(o00o0oo0, ooo07);
                parcel2.writeNoException();
                return true;
            case 13:
                o00O0OO0 o00o0oo02 = (o00O0OO0) o0OO00O.OooO00o(parcel, o00O0OO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                o000000O.OooO0oo(o00o0oo02);
                o000000O.OooO0oo(o00o0oo02.zzc);
                o000000O.OooO0o0(o00o0oo02.zza);
                o000O0O0(o00o0oo02.zza, true);
                o000O0o0(new OooOOO0(this, new o00O0OO0(o00o0oo02)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = o0OO00O.f26540OooO00o;
                z = parcel.readInt() != 0;
                oOO0 ooo08 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                List listO00000O = o00000O(string6, string7, z, ooo08);
                parcel2.writeNoException();
                parcel2.writeTypedList(listO00000O);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = o0OO00O.f26540OooO00o;
                z = parcel.readInt() != 0;
                o0OO00O.OooO0Oo(parcel);
                List listOooOo0 = OooOo0(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listOooOo0);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                oOO0 ooo09 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                List listOo000o = oo000o(string11, string12, ooo09);
                parcel2.writeNoException();
                parcel2.writeTypedList(listOo000o);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                o0OO00O.OooO0Oo(parcel);
                List listOooo0OO = Oooo0OO(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listOooo0OO);
                return true;
            case 18:
                oOO0 ooo010 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                OoooOO0(ooo010);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                oOO0 ooo011 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                OooOooO(ooo011, bundle);
                parcel2.writeNoException();
                return true;
            case 20:
                oOO0 ooo012 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                o00Ooo(ooo012);
                parcel2.writeNoException();
                return true;
            case 21:
                oOO0 ooo013 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                oo0oOO0 oo0ooo0OooOoo = OooOoo(ooo013);
                parcel2.writeNoException();
                if (oo0ooo0OooOoo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                oo0ooo0OooOoo.writeToParcel(parcel2, 1);
                return true;
            case 24:
                oOO0 ooo014 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                Bundle bundle2 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                o000OO0O(ooo014);
                o000000O.OooO0oo(ooo014.zza);
                if (ooo0000.OooooOO().OooOo0(null, o0O000O.f14299o0000OO)) {
                    try {
                        list = (List) ooo0000.OooO0O0().OooOOoo(new o0OOOO00(this, ooo014, bundle2, 0)).get(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        ooo0000.OooO00o().f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(ooo014.zza), "Failed to get trigger URIs. appId", e3);
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) ooo0000.OooO0O0().OooOOo(new o0OOOO00(this, ooo014, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e4) {
                        ooo0000.OooO00o().f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(ooo014.zza), "Failed to get trigger URIs. appId", e4);
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                oOO0 ooo015 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                OoooO(ooo015);
                parcel2.writeNoException();
                return true;
            case 26:
                oOO0 ooo016 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                Oooo0o(ooo016);
                parcel2.writeNoException();
                return true;
            case 27:
                oOO0 ooo017 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                OooooOO(ooo017);
                parcel2.writeNoException();
                return true;
            case 29:
                oOO0 ooo018 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                oO0OO00 oo0oo00 = (oO0OO00) o0OO00O.OooO00o(parcel, oO0OO00.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    o0o00o0o = iInterfaceQueryLocalInterface instanceof o0O00O ? (o0O00O) iInterfaceQueryLocalInterface : new o0O00O0o(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                o0OO00O.OooO0Oo(parcel);
                Ooooooo(ooo018, oo0oo00, o0o00o0o);
                parcel2.writeNoException();
                return true;
            case 30:
                oOO0 ooo019 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                o00O0O0O o00o0o0o = (o00O0O0O) o0OO00O.OooO00o(parcel, o00O0O0O.CREATOR);
                o0OO00O.OooO0Oo(parcel);
                o0000ooO(ooo019, o00o0o0o);
                parcel2.writeNoException();
                return true;
            case 31:
                oOO0 ooo020 = (oOO0) o0OO00O.OooO00o(parcel, oOO0.CREATOR);
                Bundle bundle3 = (Bundle) o0OO00O.OooO00o(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    o0o00 = iInterfaceQueryLocalInterface2 instanceof o0OoO00O ? (o0OoO00O) iInterfaceQueryLocalInterface2 : new o0O00(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                o0OO00O.OooO0Oo(parcel);
                o0OoOo0(ooo020, bundle3, o0o00);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void OooOOO(Runnable runnable) {
        oOO0000 ooo0000 = this.f14568OooOo0O;
        if (ooo0000.OooO0O0().OooOOo0()) {
            runnable.run();
        } else {
            ooo0000.OooO0O0().OooOo0O(runnable);
        }
    }

    @Override // OoooOOO.o0O000o0
    public final List OooOo0(String str, String str2, String str3, boolean z) {
        o000O0O0(str, true);
        oOO0000 ooo0000 = this.f14568OooOo0O;
        try {
            List<oOO00> list = (List) ooo0000.OooO0O0().OooOOo(new o0OOO0OO(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (oOO00 ooo00 : list) {
                if (z || !oOO00OO.Oooo00o(ooo00.f14779OooO0OO)) {
                    arrayList.add(new oOO000o(ooo00));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            Object obj = e;
            o0O0O0o0 o0o0o0o0OooO00o = ooo0000.OooO00o();
            o0o0o0o0OooO00o.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Failed to get user properties as. appId", obj);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            Object obj2 = e;
            o0O0O0o0 o0o0o0o0OooO00o2 = ooo0000.OooO00o();
            o0o0o0o0OooO00o2.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(str), "Failed to get user properties as. appId", obj2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // OoooOOO.o0O000o0
    public final void OooOo0O(oOO0 ooo0) {
        o000OO0O(ooo0);
        o000O0o0(new o0OOO00(this, ooo0, 0));
    }

    @Override // OoooOOO.o0O000o0
    public final oo0oOO0 OooOoo(oOO0 ooo0) {
        o000OO0O(ooo0);
        o000000O.OooO0o0(ooo0.zza);
        oOO0000 ooo0000 = this.f14568OooOo0O;
        try {
            return (oo0oOO0) ooo0000.OooO0O0().OooOOoo(new o0OO(this, ooo0)).get(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            o0O0O0o0 o0o0o0o0OooO00o = ooo0000.OooO00o();
            o0o0o0o0OooO00o.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(ooo0.zza), "Failed to get consent. appId", e);
            return new oo0oOO0(null);
        }
    }

    @Override // OoooOOO.o0O000o0
    public final void OooOooO(oOO0 ooo0, Bundle bundle) {
        o000OO0O(ooo0);
        String str = ooo0.zza;
        o000000O.OooO0oo(str);
        o000O0o0(new o0OOOO0o(this, bundle, str, ooo0));
    }

    @Override // OoooOOO.o0O000o0
    public final List Oooo0OO(String str, String str2, String str3) {
        o000O0O0(str, true);
        oOO0000 ooo0000 = this.f14568OooOo0O;
        try {
            return (List) ooo0000.OooO0O0().OooOOo(new o0OOO0OO(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            ooo0000.OooO00o().f14393OooOoOO.OooO0OO(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // OoooOOO.o0O000o0
    public final void Oooo0o(oOO0 ooo0) {
        o000000O.OooO0o0(ooo0.zza);
        o000000O.OooO0oo(ooo0.zzs);
        OooOOO(new o0OOO00(this, ooo0, 5, false));
    }

    @Override // OoooOOO.o0O000o0
    public final void Oooo0oO(oOO0 ooo0) {
        o000OO0O(ooo0);
        o000O0o0(new o0OOO00(this, ooo0, 2));
    }

    @Override // OoooOOO.o0O000o0
    public final void OoooO(oOO0 ooo0) {
        o000000O.OooO0o0(ooo0.zza);
        o000000O.OooO0oo(ooo0.zzs);
        OooOOO(new o0OOO00(this, ooo0, 6, false));
    }

    @Override // OoooOOO.o0O000o0
    public final void OoooOO0(oOO0 ooo0) {
        String str = ooo0.zza;
        o000000O.OooO0o0(str);
        o000O0O0(str, false);
        o000O0o0(new o0OOO00(this, ooo0, 3));
    }

    @Override // OoooOOO.o0O000o0
    public final void OooooOO(oOO0 ooo0) {
        o000OO0O(ooo0);
        o000O0o0(new o0OOO00(this, ooo0, 1));
    }

    @Override // OoooOOO.o0O000o0
    public final void Ooooooo(oOO0 ooo0, oO0OO00 oo0oo00, o0O00O o0o00o) {
        o000OO0O(ooo0);
        String str = ooo0.zza;
        o000000O.OooO0oo(str);
        this.f14568OooOo0O.OooO0O0().OooOo00(new o0OOOO0o(this, str, oo0oo00, o0o00o, 0));
    }

    @Override // OoooOOO.o0O000o0
    public final List o00000O(String str, String str2, boolean z, oOO0 ooo0) {
        o000OO0O(ooo0);
        String str3 = ooo0.zza;
        o000000O.OooO0oo(str3);
        oOO0000 ooo0000 = this.f14568OooOo0O;
        try {
            List<oOO00> list = (List) ooo0000.OooO0O0().OooOOo(new o0OOO0OO(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (oOO00 ooo00 : list) {
                if (z || !oOO00OO.Oooo00o(ooo00.f14779OooO0OO)) {
                    arrayList.add(new oOO000o(ooo00));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            Object obj = e;
            o0O0O0o0 o0o0o0o0OooO00o = ooo0000.OooO00o();
            o0o0o0o0OooO00o.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(ooo0.zza), "Failed to query user properties. appId", obj);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            Object obj2 = e;
            o0O0O0o0 o0o0o0o0OooO00o2 = ooo0000.OooO00o();
            o0o0o0o0OooO00o2.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(ooo0.zza), "Failed to query user properties. appId", obj2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // OoooOOO.o0O000o0
    public final byte[] o0000OO(o00OOOOo o00ooooo, String str) {
        o000000O.OooO0o0(str);
        o000000O.OooO0oo(o00ooooo);
        o000O0O0(str, true);
        oOO0000 ooo0000 = this.f14568OooOo0O;
        o0O0O0o0 o0o0o0o0OooO00o = ooo0000.OooO00o();
        o0OO0oO0 o0oo0oo0 = ooo0000.f14805Oooo00O;
        o0O00o00 o0o00o00 = o0oo0oo0.f14524OooOooo;
        String str2 = o00ooooo.zza;
        o0o0o0o0OooO00o.f14401Oooo00o.OooO0OO(o0o00o00.OooO00o(str2), "Log and bundle. event");
        ((oo000o) ooo0000.OooO0o0()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) ooo0000.OooO0O0().OooOOoo(new o0OO00OO(this, o00ooooo, str)).get();
            if (bArr == null) {
                ooo0000.OooO00o().f14393OooOoOO.OooO0OO(o0O0O0o0.OooOOoo(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((oo000o) ooo0000.OooO0o0()).getClass();
            ooo0000.OooO00o().f14401Oooo00o.OooO0o0("Log and bundle processed. event, size, time_ms", o0oo0oo0.f14524OooOooo.OooO00o(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            o0O0O0o0 o0o0o0o0OooO00o2 = ooo0000.OooO00o();
            o0o0o0o0OooO00o2.f14393OooOoOO.OooO0o0("Failed to log and bundle. appId, event, error", o0O0O0o0.OooOOoo(str), o0oo0oo0.f14524OooOooo.OooO00o(o00ooooo.zza), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            o0O0O0o0 o0o0o0o0OooO00o22 = ooo0000.OooO00o();
            o0o0o0o0OooO00o22.f14393OooOoOO.OooO0o0("Failed to log and bundle. appId, event, error", o0O0O0o0.OooOOoo(str), o0oo0oo0.f14524OooOooo.OooO00o(o00ooooo.zza), e);
            return null;
        }
    }

    @Override // OoooOOO.o0O000o0
    public final void o0000Oo(o00O0OO0 o00o0oo0, oOO0 ooo0) {
        o000000O.OooO0oo(o00o0oo0);
        o000000O.OooO0oo(o00o0oo0.zzc);
        o000OO0O(ooo0);
        o00O0OO0 o00o0oo02 = new o00O0OO0(o00o0oo0);
        o00o0oo02.zza = ooo0.zza;
        o000O0o0(new o00000OO(this, o00o0oo02, ooo0));
    }

    @Override // OoooOOO.o0O000o0
    public final void o0000Ooo(long j, String str, String str2, String str3) {
        o000O0o0(new o0OOO0(this, str2, str3, str, j));
    }

    @Override // OoooOOO.o0O000o0
    public final void o0000o0(o00OOOOo o00ooooo, oOO0 ooo0) {
        o000000O.OooO0oo(o00ooooo);
        o000OO0O(ooo0);
        o000O0o0(new o00000OO(this, o00ooooo, ooo0));
    }

    @Override // OoooOOO.o0O000o0
    public final void o0000ooO(oOO0 ooo0, o00O0O0O o00o0o0o) {
        o000OO0O(ooo0);
        o000O0o0(new o00000OO(this, ooo0, o00o0o0o, 6));
    }

    public final void o000O0O0(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        oOO0000 ooo0000 = this.f14568OooOo0O;
        if (zIsEmpty) {
            ooo0000.OooO00o().f14393OooOoOO.OooO0O0("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f14569OooOo0o == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.f14567OooOo) && !o00oO0o.OooOO0(ooo0000.f14805Oooo00O.f14516OooOo0O, Binder.getCallingUid()) && !o000OO00.OooO00o(ooo0000.f14805Oooo00O.f14516OooOo0O).OooO0O0(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.f14569OooOo0o = Boolean.valueOf(z2);
                }
                if (this.f14569OooOo0o.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                ooo0000.OooO00o().f14393OooOoOO.OooO0OO(o0O0O0o0.OooOOoo(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f14567OooOo == null) {
            Context context = ooo0000.f14805Oooo00O.f14516OooOo0O;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = o000O.f13660OooO00o;
            if (o00oO0o.OooOOOO(context, str, callingUid)) {
                this.f14567OooOo = str;
            }
        }
        if (str.equals(this.f14567OooOo)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // OoooOOO.o0O000o0
    public final String o000O0Oo(oOO0 ooo0) {
        o000OO0O(ooo0);
        oOO0000 ooo0000 = this.f14568OooOo0O;
        try {
            return (String) ooo0000.OooO0O0().OooOOo(new o0OO(ooo0000, ooo0)).get(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            o0O0O0o0 o0o0o0o0OooO00o = ooo0000.OooO00o();
            o0o0o0o0OooO00o.f14393OooOoOO.OooO0Oo(o0O0O0o0.OooOOoo(ooo0.zza), "Failed to get app instance id. appId", e);
            return null;
        }
    }

    public final void o000O0o0(Runnable runnable) {
        oOO0000 ooo0000 = this.f14568OooOo0O;
        if (ooo0000.OooO0O0().OooOOo0()) {
            runnable.run();
        } else {
            ooo0000.OooO0O0().OooOo00(runnable);
        }
    }

    public final void o000OO0O(oOO0 ooo0) {
        o000000O.OooO0oo(ooo0);
        String str = ooo0.zza;
        o000000O.OooO0o0(str);
        o000O0O0(str, false);
        this.f14568OooOo0O.o0OoOo0().OooOOOO(ooo0.zzb);
    }

    @Override // OoooOOO.o0O000o0
    public final void o00Ooo(oOO0 ooo0) {
        o000000O.OooO0o0(ooo0.zza);
        o000000O.OooO0oo(ooo0.zzs);
        OooOOO(new o0OOO00(this, ooo0, 4));
    }

    @Override // OoooOOO.o0O000o0
    public final void o0O0O00(oOO000o ooo000o, oOO0 ooo0) {
        o000000O.OooO0oo(ooo000o);
        o000OO0O(ooo0);
        o000O0o0(new o00000OO(this, ooo000o, ooo0));
    }

    @Override // OoooOOO.o0O000o0
    public final void o0OoOo0(oOO0 ooo0, Bundle bundle, o0OoO00O o0ooo00o) {
        o000OO0O(ooo0);
        String str = ooo0.zza;
        o000000O.OooO0oo(str);
        this.f14568OooOo0O.OooO0O0().OooOo00(new OoooO0O.o00O0O0(this, ooo0, bundle, o0ooo00o, str, 1));
    }

    @Override // OoooOOO.o0O000o0
    public final List oo000o(String str, String str2, oOO0 ooo0) {
        o000OO0O(ooo0);
        String str3 = ooo0.zza;
        o000000O.OooO0oo(str3);
        oOO0000 ooo0000 = this.f14568OooOo0O;
        try {
            return (List) ooo0000.OooO0O0().OooOOo(new o0OOO0OO(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            ooo0000.OooO00o().f14393OooOoOO.OooO0OO(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }
}
