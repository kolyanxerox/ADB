package OooOOo0;

import OooOOO.OooO00o;
import OooOOO.OooO0O0;
import OooOOoo.o0000O;
import OooOooo.o000Oo0;
import Oooo0oO.o00000;
import OoooOOO.o0O0oo00;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC1397at;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1449c8;
import com.google.android.gms.internal.ads.AbstractC1633h8;
import com.google.android.gms.internal.ads.AbstractC1990qx;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.AbstractC2243xr;
import com.google.android.gms.internal.ads.C1431bq;
import com.google.android.gms.internal.ads.C1503dq;
import com.google.android.gms.internal.ads.C1514e0;
import com.google.android.gms.internal.ads.C1577fq;
import com.google.android.gms.internal.ads.C1658hx;
import com.google.android.gms.internal.ads.C1676ie;
import com.google.android.gms.internal.ads.C1768kx;
import com.google.android.gms.internal.ads.C1847n1;
import com.google.android.gms.internal.ads.C1875nt;
import com.google.android.gms.internal.ads.C2070t2;
import com.google.android.gms.internal.ads.C2093tp;
import com.google.android.gms.internal.ads.C2098tu;
import com.google.android.gms.internal.ads.C2104u;
import com.google.android.gms.internal.ads.C2123ui;
import com.google.android.gms.internal.ads.C2130up;
import com.google.android.gms.internal.ads.C2148v6;
import com.google.android.gms.internal.ads.C2206wr;
import com.google.android.gms.internal.ads.C2229xd;
import com.google.android.gms.internal.ads.C2241xp;
import com.google.android.gms.internal.ads.C2247xv;
import com.google.android.gms.internal.ads.C2274yl;
import com.google.android.gms.internal.ads.C2279yq;
import com.google.android.gms.internal.ads.RunnableC1580ft;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.aj0;
import com.google.android.gms.internal.ads.az0;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.bd0;
import com.google.android.gms.internal.ads.bj0;
import com.google.android.gms.internal.ads.c60;
import com.google.android.gms.internal.ads.c90;
import com.google.android.gms.internal.ads.cc0;
import com.google.android.gms.internal.ads.dd0;
import com.google.android.gms.internal.ads.de0;
import com.google.android.gms.internal.ads.f10;
import com.google.android.gms.internal.ads.fc0;
import com.google.android.gms.internal.ads.fd0;
import com.google.android.gms.internal.ads.gu0;
import com.google.android.gms.internal.ads.h10;
import com.google.android.gms.internal.ads.h90;
import com.google.android.gms.internal.ads.hi0;
import com.google.android.gms.internal.ads.i10;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.jf0;
import com.google.android.gms.internal.ads.kd0;
import com.google.android.gms.internal.ads.l80;
import com.google.android.gms.internal.ads.mf0;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.ni0;
import com.google.android.gms.internal.ads.o0o0000;
import com.google.android.gms.internal.ads.oO000Oo;
import com.google.android.gms.internal.ads.oO0O0OoO;
import com.google.android.gms.internal.ads.oOo00OO0;
import com.google.android.gms.internal.ads.oi0;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.pi0;
import com.google.android.gms.internal.ads.qu0;
import com.google.android.gms.internal.ads.qx0;
import com.google.android.gms.internal.ads.r80;
import com.google.android.gms.internal.ads.rd0;
import com.google.android.gms.internal.ads.s20;
import com.google.android.gms.internal.ads.vp0;
import com.google.android.gms.internal.ads.wt0;
import com.google.android.gms.internal.ads.yc0;
import com.google.android.gms.internal.ads.yi0;
import com.google.android.gms.internal.ads.yp0;
import com.google.android.gms.internal.ads.ze0;
import com.google.android.gms.internal.ads.zi0;
import com.google.android.gms.internal.measurement.o0OO00OO;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C3034d9;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import o0000OOo.o00O00O;
import o0000OOo.o00O0O00;
import o0000OOo.o00OO0OO;
import o000o00o.o000OO;
import o00O00oO.o0000O0;
import o00O0oO.o000000;
import o00O0oO.o0000O00;
import o00OOO0.o0O0O00;
import o00OOO0.o0OO00O;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o0OOO0o implements o0000O, o0o0000, zzg, vp0, Oooo00O.OooO0OO, Oooo00O.OooO0o {

    /* renamed from: OooOo */
    public Object f13516OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13517OooOo0O;

    /* renamed from: OooOo0o */
    public Object f13518OooOo0o;

    /* renamed from: OooOoO */
    public Object f13519OooOoO;

    /* renamed from: OooOoO0 */
    public Object f13520OooOoO0;

    /* renamed from: OooOoOO */
    public Object f13521OooOoOO;

    public o0OOO0o(Context context, C1676ie c1676ie, VersionInfoParcel versionInfoParcel) {
        this.f13517OooOo0O = 3;
        this.f13518OooOo0o = new Object();
        this.f13516OooOo = context.getApplicationContext();
        this.f13521OooOoOO = versionInfoParcel;
        this.f13519OooOoO = c1676ie;
    }

    public static String OooO0o(String str) {
        if (str == null || !o000000.Oooo0o("/", str)) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        String strSubstring = str.substring(0, o000000.OoooO0O(str, "/", 0, 6));
        kotlin.jvm.internal.OooOo.OooO0Oo(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static C1514e0 OooOo0() {
        C2104u c2104uOoooOOO = C1514e0.OoooOOO();
        c2104uOoooOOO.OooO0Oo();
        C1514e0.Oooo00o((C1514e0) c2104uOoooOOO.f25822OooOo0o, 32768L);
        return (C1514e0) c2104uOoooOOO.OooO0O0();
    }

    public static JSONObject OooOo0o(Context context, VersionInfoParcel versionInfoParcel) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) AbstractC1633h8.f19641OooO0O0.OooOOO()).booleanValue()) {
                jSONObject.put(C3034d9.h.f8089V, context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", AbstractC1633h8.f19642OooO0OO.OooOOO());
            jSONObject.put("cl", "697668803");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", Oooo0oO.o000000.OooO0Oo(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static o0OOO0o OooOoO0(Context context, ExecutorService executorService, o0O0oo00 o0o0oo00, hi0 hi0Var) {
        final o0OOO0o o0ooo0o = new o0OOO0o(context, executorService, o0o0oo00, hi0Var, new oi0(), new pi0());
        if (hi0Var.f19796OooO0O0) {
            final int i = 0;
            o0ooo0o.f13519OooOoO = Tasks.call(executorService, new Callable(o0ooo0o) { // from class: com.google.android.gms.internal.ads.mi0

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ OooOOo0.o0OOO0o f21256OooOo0o;

                {
                    this.f21256OooOo0o = o0ooo0o;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() throws IllegalStateException, OooOooo.o000O0O0, PackageManager.NameNotFoundException, IOException, OooOooo.o000OO0O {
                    switch (i) {
                        case 0:
                            OooOOo0.o0OOO0o o0ooo0o2 = this.f21256OooOo0o;
                            C2104u c2104uOoooOOO = C1514e0.OoooOOO();
                            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo((Context) o0ooo0o2.f13518OooOo0o);
                            String id = advertisingIdInfo.getId();
                            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                                UUID uuidFromString = UUID.fromString(id);
                                byte[] bArr = new byte[16];
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                                id = Base64.encodeToString(bArr, 11);
                            }
                            if (id != null) {
                                c2104uOoooOOO.OooO0Oo();
                                C1514e0.OooOo0o((C1514e0) c2104uOoooOOO.f25822OooOo0o, id);
                                boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                                c2104uOoooOOO.OooO0Oo();
                                C1514e0.o0000Ooo((C1514e0) c2104uOoooOOO.f25822OooOo0o, zIsLimitAdTrackingEnabled);
                                c2104uOoooOOO.OooO0Oo();
                                C1514e0.o0OoOo0((C1514e0) c2104uOoooOOO.f25822OooOo0o);
                            }
                            return (C1514e0) c2104uOoooOOO.OooO0O0();
                        default:
                            Context context2 = (Context) this.f21256OooOo0o.f13518OooOo0o;
                            return ii0.OooO0o0(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                    }
                }
            }).addOnFailureListener(executorService, new ni0(o0ooo0o, 0));
        } else {
            o0ooo0o.f13519OooOoO = Tasks.forResult(oi0.f22998OooO00o);
        }
        final int i2 = 1;
        o0ooo0o.f13521OooOoOO = Tasks.call(executorService, new Callable(o0ooo0o) { // from class: com.google.android.gms.internal.ads.mi0

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooOOo0.o0OOO0o f21256OooOo0o;

            {
                this.f21256OooOo0o = o0ooo0o;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws IllegalStateException, OooOooo.o000O0O0, PackageManager.NameNotFoundException, IOException, OooOooo.o000OO0O {
                switch (i2) {
                    case 0:
                        OooOOo0.o0OOO0o o0ooo0o2 = this.f21256OooOo0o;
                        C2104u c2104uOoooOOO = C1514e0.OoooOOO();
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo((Context) o0ooo0o2.f13518OooOo0o);
                        String id = advertisingIdInfo.getId();
                        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                            UUID uuidFromString = UUID.fromString(id);
                            byte[] bArr = new byte[16];
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                            id = Base64.encodeToString(bArr, 11);
                        }
                        if (id != null) {
                            c2104uOoooOOO.OooO0Oo();
                            C1514e0.OooOo0o((C1514e0) c2104uOoooOOO.f25822OooOo0o, id);
                            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                            c2104uOoooOOO.OooO0Oo();
                            C1514e0.o0000Ooo((C1514e0) c2104uOoooOOO.f25822OooOo0o, zIsLimitAdTrackingEnabled);
                            c2104uOoooOOO.OooO0Oo();
                            C1514e0.o0OoOo0((C1514e0) c2104uOoooOOO.f25822OooOo0o);
                        }
                        return (C1514e0) c2104uOoooOOO.OooO0O0();
                    default:
                        Context context2 = (Context) this.f21256OooOo0o.f13518OooOo0o;
                        return ii0.OooO0o0(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                }
            }
        }).addOnFailureListener(executorService, new ni0(o0ooo0o, 0));
        return o0ooo0o;
    }

    @Override // Oooo00O.OooO0o
    public void OooO(o000Oo0 o000oo02) throws InterruptedException {
        try {
            ((LinkedBlockingQueue) this.f13519OooOoO).put(OooOo0());
        } catch (InterruptedException unused) {
        }
    }

    public void OooO00o(Object obj, Object obj2, o00O0O00 o00o0o00, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.f13516OooOo) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (o00o0o00.OooOoo() != o00O00O.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer numValueOf = Integer.valueOf(o00o0o00.OooOoOO());
        if (o00o0o00.OooOoo0() == o00OO0OO.RAW) {
            numValueOf = null;
        }
        o00000oo.OooOo00 oooOo00OooO00o = o000OO.OooOOO.f30166OooO0O0.OooO00o(o000OO.o0OoOo0.OooO00o(o00o0o00.OooOoO().OooOoOO(), o00o0o00.OooOoO().OooOoo0(), o00o0o00.OooOoO().OooOoO(), o00o0o00.OooOoo0(), numValueOf));
        int iOrdinal = o00o0o00.OooOoo0().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(o00o0o00.OooOoOO()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(o00o0o00.OooOoOO()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(o00o0o00.OooOoOO()).array();
        } else {
            bArrArray = o00000oo.OooOo00.f29284OooO00o;
        }
        o00000oo.oo000o oo000oVar = new o00000oo.oo000o(obj, obj2, bArrArray, o00o0o00.OooOoo(), o00o0o00.OooOoo0(), o00o0o00.OooOoOO(), o00o0o00.OooOoO().OooOoOO(), oooOo00OooO00o);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f13516OooOo;
        ArrayList arrayList = (ArrayList) this.f13520OooOoO0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(oo000oVar);
        byte[] bArr = oo000oVar.f29304OooO0OO;
        o00000oo.o00oO0o o00oo0o = new o00000oo.o00oO0o(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(o00oo0o, Collections.unmodifiableList(arrayList2));
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(list);
            arrayList3.add(oo000oVar);
            concurrentHashMap.put(o00oo0o, Collections.unmodifiableList(arrayList3));
        }
        arrayList.add(oo000oVar);
        if (z) {
            if (((o00000oo.oo000o) this.f13519OooOoO) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f13519OooOoO = oo000oVar;
        }
    }

    public o0000.OooOo00 OooO0O0() {
        if (((Integer) this.f13518OooOo0o) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f13516OooOo) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        Integer num = (Integer) this.f13520OooOoO0;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((o0000.OooOOOO) this.f13519OooOoO) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((o0000.OooOOOO) this.f13521OooOoOO) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        o0000.OooOOOO oooOOOO = (o0000.OooOOOO) this.f13519OooOoO;
        if (oooOOOO == o0000.OooOOOO.f28904OooO0OO) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (oooOOOO == o0000.OooOOOO.f28905OooO0Oo) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (oooOOOO == o0000.OooOOOO.f28907OooO0o0) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (oooOOOO == o0000.OooOOOO.f28906OooO0o) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (oooOOOO != o0000.OooOOOO.f28908OooO0oO) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new o0000.OooOo00(((Integer) this.f13518OooOo0o).intValue(), ((Integer) this.f13516OooOo).intValue(), ((Integer) this.f13520OooOoO0).intValue(), (o0000.OooOOOO) this.f13521OooOoOO, (o0000.OooOOOO) this.f13519OooOoO);
    }

    public o0OO00O OooO0OO() {
        if (((o00OOO0.o0OoOo0) this.f13518OooOo0o) != null) {
            return new o0OO00O(this);
        }
        throw new IllegalStateException("url == null");
    }

    @Override // com.google.android.gms.internal.ads.o0o0000
    public ArrayList OooO0Oo(long j) {
        oO0O0OoO oo0o0ooo = (oO0O0OoO) this.f13518OooOo0o;
        ArrayList arrayList = new ArrayList();
        oo0o0ooo.OooO0oo(j, oo0o0ooo.f22655OooO0oo, arrayList);
        TreeMap treeMap = new TreeMap();
        oo0o0ooo.OooOO0(j, false, oo0o0ooo.f22655OooO0oo, treeMap);
        HashMap map = (HashMap) this.f13519OooOoO;
        oo0o0ooo.OooO(j, (Map) this.f13520OooOoO0, map, oo0o0ooo.f22655OooO0oo, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) ((HashMap) this.f13521OooOoOO).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                oOo00OO0 ooo00oo0 = (oOo00OO0) map.get(pair.first);
                ooo00oo0.getClass();
                arrayList2.add(new C2206wr(null, null, null, bitmapDecodeByteArray, ooo00oo0.f22876OooO0OO, 0, ooo00oo0.f22879OooO0o0, ooo00oo0.f22875OooO0O0, 0, Integer.MIN_VALUE, -3.4028235E38f, ooo00oo0.f22878OooO0o, ooo00oo0.f22880OooO0oO, ooo00oo0.f22882OooOO0, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            oOo00OO0 ooo00oo02 = (oOo00OO0) map.get(entry.getKey());
            ooo00oo02.getClass();
            C2279yq c2279yq = (C2279yq) entry.getValue();
            CharSequence charSequence = c2279yq.f25994OooO00o;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (oO000Oo oo000oo : (oO000Oo[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), oO000Oo.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(oo000oo), spannableStringBuilder.getSpanEnd(oo000oo), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c2279yq.f25999OooO0o0 = ooo00oo02.f22876OooO0OO;
            c2279yq.f25998OooO0o = ooo00oo02.f22877OooO0Oo;
            c2279yq.f26000OooO0oO = ooo00oo02.f22879OooO0o0;
            c2279yq.f26001OooO0oo = ooo00oo02.f22875OooO0O0;
            c2279yq.OooOO0o = ooo00oo02.f22878OooO0o;
            c2279yq.f26003OooOO0O = ooo00oo02.f22873OooO;
            c2279yq.f26002OooOO0 = ooo00oo02.f22881OooO0oo;
            c2279yq.f26004OooOOO = ooo00oo02.f22882OooOO0;
            arrayList2.add(c2279yq.OooO00o());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0040  */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewGroup, o00O0O.OooO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0o0(android.graphics.Canvas r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f13519OooOoO
            o00O0O.OooO0o r0 = (o00O0O.OooO0o) r0
            if (r0 == 0) goto L12
            float r0 = r0.f31312OooO0OO
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            java.lang.Object r1 = r8.f13520OooOoO0
            r7 = r1
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            java.lang.Object r1 = r8.f13518OooOo0o
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.Object r2 = r8.f13516OooOo
            android.view.View r2 = (android.view.View) r2
            if (r0 != 0) goto L42
            r1.OooO0OO(r9)
            int r0 = r7.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L40
            int r0 = r2.getWidth()
            float r5 = (float) r0
            int r0 = r2.getHeight()
            float r6 = (float) r0
            r3 = 0
            r4 = 0
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L5f
        L40:
            r2 = r9
            goto L5f
        L42:
            r1.OooO0OO(r9)
            int r0 = r7.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L40
            int r0 = r2.getWidth()
            float r5 = (float) r0
            int r0 = r2.getHeight()
            float r6 = (float) r0
            r3 = 0
            r4 = 0
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
        L5f:
            java.lang.Object r9 = r8.f13521OooOoOO
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            if (r9 == 0) goto L9a
            java.lang.Object r0 = r8.f13519OooOoO
            o00O0O.OooO0o r0 = (o00O0O.OooO0o) r0
            if (r0 == 0) goto L9a
            android.graphics.Rect r9 = r9.getBounds()
            java.lang.Object r0 = r8.f13519OooOoO
            o00O0O.OooO0o r0 = (o00O0O.OooO0o) r0
            float r0 = r0.f31310OooO00o
            int r1 = r9.width()
            float r1 = (float) r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r0 = r0 - r1
            java.lang.Object r1 = r8.f13519OooOoO
            o00O0O.OooO0o r1 = (o00O0O.OooO0o) r1
            float r1 = r1.f31311OooO0O0
            int r9 = r9.height()
            float r9 = (float) r9
            float r9 = r9 / r3
            float r1 = r1 - r9
            r2.translate(r0, r1)
            java.lang.Object r9 = r8.f13521OooOoOO
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r9.draw(r2)
            float r9 = -r0
            float r0 = -r1
            r2.translate(r9, r0)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOo0.o0OOO0o.OooO0o0(android.graphics.Canvas):void");
    }

    public o00O0O.OooO0o OooO0oO() {
        o00O0O.OooO0o oooO0o = (o00O0O.OooO0o) this.f13519OooOoO;
        if (oooO0o == null) {
            return null;
        }
        o00O0O.OooO0o oooO0o2 = new o00O0O.OooO0o(oooO0o);
        if (oooO0o2.f31312OooO0OO == Float.MAX_VALUE) {
            float f = oooO0o2.f31310OooO00o;
            float f2 = oooO0o2.f31311OooO0O0;
            View view = (View) this.f13516OooOo;
            oooO0o2.f31312OooO0OO = o00000.OooO0OO(f, f2, view.getWidth(), view.getHeight());
        }
        return oooO0o2;
    }

    public File OooO0oo() {
        Context context = (Activity) this.f13516OooOo;
        if (context == null) {
            context = (Context) this.f13518OooOo0o;
        }
        return new File(context.getCacheDir(), "share_plus");
    }

    @Override // Oooo00O.OooO0OO
    public void OooOO0(Bundle bundle) {
        bj0 bj0Var;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f13519OooOoO;
        HandlerThread handlerThread = (HandlerThread) this.f13521OooOoOO;
        try {
            bj0Var = (bj0) ((yi0) this.f13518OooOo0o).getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            bj0Var = null;
        }
        if (bj0Var != null) {
            try {
                try {
                    zi0 zi0Var = new zi0(1, (String) this.f13516OooOo, (String) this.f13520OooOoO0);
                    Parcel parcelOooO = bj0Var.OooO();
                    AbstractC2218x2.OooO0OO(parcelOooO, zi0Var);
                    Parcel parcelOooOOO = bj0Var.OooOOO(parcelOooO, 1);
                    aj0 aj0Var = (aj0) AbstractC2218x2.OooO00o(parcelOooOOO, aj0.CREATOR);
                    parcelOooOOO.recycle();
                    linkedBlockingQueue.put(aj0Var.OooO0o0());
                } catch (InterruptedException unused2) {
                } catch (Throwable th) {
                    zzc();
                    handlerThread.quit();
                    throw th;
                }
            } catch (Throwable unused3) {
                linkedBlockingQueue.put(OooOo0());
            }
            zzc();
            handlerThread.quit();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup, o00O0O.OooO] */
    public boolean OooOO0O() {
        if (((ViewGroup) this.f13518OooOo0o).OooO0Oo()) {
            o00O0O.OooO0o oooO0o = (o00O0O.OooO0o) this.f13519OooOoO;
            if (oooO0o == null || oooO0o.f31312OooO0OO == Float.MAX_VALUE) {
                return true;
            }
        }
        return false;
    }

    public void OooOO0o(String str, o0O0O00 o0o0o00) {
        if (str == null) {
            throw new NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (o0o0o00 != null && !o0OO00OO.OooOoO0(str)) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0O("method ", str, " must not have a request body."));
        }
        if (o0o0o00 == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0O("method ", str, " must have a request body."));
        }
        this.f13516OooOo = str;
        this.f13519OooOoO = o0o0o00;
    }

    @Override // Oooo00O.OooO0OO
    public void OooOOO(int i) throws InterruptedException {
        try {
            ((LinkedBlockingQueue) this.f13519OooOoO).put(OooOo0());
        } catch (InterruptedException unused) {
        }
    }

    public void OooOOO0(String str) {
        ((o000Ooo.o00oO0o) this.f13520OooOoO0).OooO0oO(str);
    }

    public void OooOOOO(OooO00o oooO00o, OooOOO.OooOO0 oooOO0) {
        OooOo oooOo = (OooOo) this.f13518OooOo0o;
        String str = (String) this.f13516OooOo;
        OooOOO.OooO0o oooO0o = (OooOOO.OooO0o) this.f13519OooOoO;
        if (oooO0o == null) {
            throw new NullPointerException("Null transformer");
        }
        OooO0O0 oooO0O0 = (OooO0O0) this.f13520OooOoO0;
        o0Oo0oo o0oo0oo = (o0Oo0oo) this.f13521OooOoOO;
        OooOo oooOoOooO00o = oooOo.OooO00o(oooO00o.f13314OooO0O0);
        OooOOOO oooOOOO = new OooOOOO();
        oooOOOO.f13481OooO0o = new HashMap();
        oooOOOO.f13480OooO0Oo = Long.valueOf(o0oo0oo.f13523OooO00o.OooO00o());
        oooOOOO.f13482OooO0o0 = Long.valueOf(o0oo0oo.f13524OooO0O0.OooO00o());
        oooOOOO.f13477OooO00o = str;
        oooOOOO.f13479OooO0OO = new o000oOoO(oooO0O0, (byte[]) oooO0o.apply(oooO00o.f13313OooO00o));
        oooOOOO.f13478OooO0O0 = null;
        OooOo00 oooOo00OooO0O0 = oooOOOO.OooO0O0();
        OooOo0O.OooO0OO oooO0OO = (OooOo0O.OooO0OO) o0oo0oo.f13525OooO0OO;
        oooO0OO.getClass();
        oooO0OO.f13602OooO0O0.execute(new OooOo0O.OooO0O0(oooO0OO, oooOoOooO00o, oooOO0, oooOo00OooO0O0, 0));
    }

    public void OooOOOo(Drawable drawable) {
        this.f13521OooOoOO = drawable;
        ((View) this.f13516OooOo).invalidate();
    }

    public void OooOOo(o00O0O.OooO0o oooO0o) {
        View view = (View) this.f13516OooOo;
        if (oooO0o == null) {
            this.f13519OooOoO = null;
        } else {
            o00O0O.OooO0o oooO0o2 = (o00O0O.OooO0o) this.f13519OooOoO;
            if (oooO0o2 == null) {
                this.f13519OooOoO = new o00O0O.OooO0o(oooO0o);
            } else {
                float f = oooO0o.f31310OooO00o;
                float f2 = oooO0o.f31311OooO0O0;
                float f3 = oooO0o.f31312OooO0OO;
                oooO0o2.f31310OooO00o = f;
                oooO0o2.f31311OooO0O0 = f2;
                oooO0o2.f31312OooO0OO = f3;
            }
            if (oooO0o.f31312OooO0OO + 1.0E-4f >= o00000.OooO0OO(oooO0o.f31310OooO00o, oooO0o.f31311OooO0O0, view.getWidth(), view.getHeight())) {
                ((o00O0O.OooO0o) this.f13519OooOoO).f31312OooO0OO = Float.MAX_VALUE;
            }
        }
        view.invalidate();
    }

    public void OooOOo0(int i) {
        ((Paint) this.f13520OooOoO0).setColor(i);
        ((View) this.f13516OooOo).invalidate();
    }

    public void OooOOoo(Map map) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<? extends Parcelable> arrayList3;
        String str;
        String strConcat;
        MethodChannel.Result result;
        boolean zOooo0OO;
        File fileOooO0oo = OooO0oo();
        File[] fileArrListFiles = fileOooO0oo.listFiles();
        if (fileOooO0oo.exists() && fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
            fileOooO0oo.delete();
        }
        String str2 = (String) map.get(C3034d9.h.f8077K0);
        String str3 = (String) map.get("uri");
        String str4 = (String) map.get("subject");
        String str5 = (String) map.get(C3034d9.h.f8063D0);
        List list = (List) map.get("paths");
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) map.get("mimeTypes");
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        Context context = (Context) this.f13518OooOo0o;
        if (arrayList != null) {
            arrayList3 = new ArrayList<>(arrayList.size());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                File file2 = new File((String) obj3);
                try {
                    String canonicalPath = file2.getCanonicalPath();
                    kotlin.jvm.internal.OooOo.OooO0O0(canonicalPath);
                    String canonicalPath2 = OooO0oo().getCanonicalPath();
                    kotlin.jvm.internal.OooOo.OooO0Oo(canonicalPath2, "getCanonicalPath(...)");
                    zOooo0OO = o0000O00.Oooo0OO(canonicalPath, canonicalPath2, false);
                } catch (IOException unused) {
                    zOooo0OO = false;
                }
                if (zOooo0OO) {
                    throw new IOException(OooO0oO.OooOo.OooOO0O("Shared file can not be located in '", OooO0oo().getCanonicalPath(), "'"));
                }
                File fileOooO0oo2 = OooO0oo();
                if (!fileOooO0oo2.exists()) {
                    fileOooO0oo2.mkdirs();
                }
                File file3 = new File(fileOooO0oo2, file2.getName());
                o00O0Oo0.oo000o.OooOO0o(file2, file3);
                Context context2 = (Activity) this.f13516OooOo;
                if (context2 == null) {
                    context2 = context;
                }
                arrayList3.add(FileProvider.getUriForFile(context2, (String) ((oo00o.OooOOOO) this.f13519OooOoO).getValue(), file3));
            }
        } else {
            arrayList3 = null;
        }
        Intent intent = new Intent();
        if (arrayList3 == null) {
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            if (str3 != null) {
                str2 = str3;
            }
            intent.putExtra("android.intent.extra.TEXT", str2);
            if (!(str4 == null || o000000.OoooOO0(str4))) {
                intent.putExtra("android.intent.extra.SUBJECT", str4);
            }
            if (!(str5 == null || o000000.OoooOO0(str5))) {
                intent.putExtra("android.intent.extra.TITLE", str5);
            }
        } else {
            if (arrayList3.isEmpty()) {
                throw new IOException("Error sharing files: No files found");
            }
            str = "*/*";
            if (arrayList3.size() == 1) {
                str = arrayList2 == null || arrayList2.isEmpty() ? "*/*" : (String) o00O0.OooOo00.OooOoOO(arrayList2);
                intent.setAction("android.intent.action.SEND");
                intent.setType(str);
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) o00O0.OooOo00.OooOoOO(arrayList3));
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    strConcat = str;
                    intent.setType(strConcat);
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                } else {
                    if (arrayList2.size() == 1) {
                        str = (String) o00O0.OooOo00.OooOoOO(arrayList2);
                    } else {
                        strConcat = (String) o00O0.OooOo00.OooOoOO(arrayList2);
                        int iOooOOo0 = o00O0.OooOo.OooOOo0(arrayList2);
                        if (1 <= iOooOOo0) {
                            int i2 = 1;
                            while (true) {
                                if (!kotlin.jvm.internal.OooOo.OooO00o(strConcat, arrayList2.get(i2))) {
                                    if (!OooO0o(strConcat).equals(OooO0o((String) arrayList2.get(i2)))) {
                                        break;
                                    } else {
                                        strConcat = OooO0o((String) arrayList2.get(i2)).concat("/*");
                                    }
                                }
                                if (i2 == iOooOOo0) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        intent.setType(strConcat);
                        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                    }
                    strConcat = str;
                    intent.setType(strConcat);
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                }
            }
            if (!(str2 == null || o000000.OoooOO0(str2))) {
                intent.putExtra("android.intent.extra.TEXT", str2);
            }
            if (!(str4 == null || o000000.OoooOO0(str4))) {
                intent.putExtra("android.intent.extra.SUBJECT", str4);
            }
            if (!(str5 == null || o000000.OoooOO0(str5))) {
                intent.putExtra("android.intent.extra.TITLE", str5);
            }
            intent.addFlags(1);
        }
        Intent intentCreateChooser = Intent.createChooser(intent, str5, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((oo00o.OooOOOO) this.f13521OooOoOO).getValue()).intValue() | 134217728).getIntentSender());
        if (arrayList3 != null) {
            Context context3 = (Activity) this.f13516OooOo;
            if (context3 == null) {
                context3 = context;
            }
            List<ResolveInfo> listQueryIntentActivities = context3.getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
            kotlin.jvm.internal.OooOo.OooO0Oo(listQueryIntentActivities, "queryIntentActivities(...)");
            Iterator<T> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                String str6 = ((ResolveInfo) it.next()).activityInfo.packageName;
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    Parcelable parcelable = arrayList3.get(i3);
                    i3++;
                    Uri uri = (Uri) parcelable;
                    Context context4 = (Activity) this.f13516OooOo;
                    if (context4 == null) {
                        context4 = context;
                    }
                    context4.grantUriPermission(str6, uri, 3);
                }
            }
        }
        kotlin.jvm.internal.OooOo.OooO0O0(intentCreateChooser);
        Activity activity = (Activity) this.f13516OooOo;
        if (activity != null) {
            activity.startActivityForResult(intentCreateChooser, 22643);
            return;
        }
        intentCreateChooser.addFlags(268435456);
        o00O00OO.OooO0OO oooO0OO = (o00O00OO.OooO0OO) this.f13520OooOoO0;
        if (oooO0OO.f31267OooOo0o.compareAndSet(false, true) && (result = oooO0OO.f31266OooOo0O) != null) {
            result.success("dev.fluttercommunity.plus/share/unavailable");
            oooO0OO.f31266OooOo0O = null;
        }
        context.startActivity(intentCreateChooser);
    }

    public void OooOo00(String str) {
        String str2;
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str2 = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str2 = "https:" + str.substring(4);
        } else {
            str2 = str;
        }
        C2229xd c2229xd = new C2229xd();
        c2229xd.OooO0O0(null, str2);
        this.f13518OooOo0o = c2229xd.OooO00o();
    }

    public o00000oO.OooOOO OooOo0O() {
        synchronized (this.f13518OooOo0o) {
            try {
                if (((SharedPreferences) this.f13520OooOoO0) == null) {
                    this.f13520OooOoO0 = ((Context) this.f13516OooOo).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.f13520OooOoO0;
        long j = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        if (System.currentTimeMillis() - j < ((Long) AbstractC1633h8.f19643OooO0Oo.OooOOO()).longValue()) {
            return yp0.f25991OooOo0o;
        }
        return ii0.Ooooooo(((C1676ie) this.f13519OooOoO).OooO00o(OooOo0o((Context) this.f13516OooOo, (VersionInfoParcel) this.f13521OooOoOO)), new C2123ui(this, 0), AbstractC2200wl.f25327OooO0oO);
    }

    public void OooOoO(Object obj, qx0 qx0Var, boolean z) throws GeneralSecurityException {
        byte[] bArrOooO0O0;
        if (((HashMap) this.f13516OooOo) == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (qx0Var.OooOooo() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int iOrdinal = qx0Var.OooOoO().ordinal();
        if (iOrdinal == 1) {
            bArrOooO0O0 = gu0.OooO0O0(qx0Var.OooOo0o()).OooO0O0();
        } else if (iOrdinal == 2) {
            bArrOooO0O0 = gu0.OooO00o(qx0Var.OooOo0o()).OooO0O0();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrOooO0O0 = gu0.OooO00o(qx0Var.OooOo0o()).OooO0O0();
        } else {
            bArrOooO0O0 = af0.f17032OooO0o;
        }
        az0 az0VarOooO00o = az0.OooO00o(bArrOooO0O0);
        qu0 qu0Var = new qu0(obj, az0VarOooO00o, qx0Var.OooOooo(), qx0Var.OooOoO(), qx0Var.OooOo0o(), qx0Var.OooOo().OooOoOO());
        HashMap map = (HashMap) this.f13516OooOo;
        ArrayList arrayList = (ArrayList) this.f13520OooOoO0;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(qu0Var);
        List list = (List) map.put(az0VarOooO00o, Collections.unmodifiableList(arrayList2));
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(list);
            arrayList3.add(qu0Var);
            map.put(az0VarOooO00o, Collections.unmodifiableList(arrayList3));
        }
        arrayList.add(qu0Var);
        if (z) {
            if (((qu0) this.f13519OooOoO) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f13519OooOoO = qu0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] OooOoOO() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f13521OooOoOO
            byte[] r0 = (byte[]) r0
            r1 = 0
            if (r0 != 0) goto L5a
            java.lang.Object r0 = r9.f13519OooOoO
            java.io.File r0 = (java.io.File) r0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L53
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L53
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            r3 = 256(0x100, float:3.59E-43)
        L17:
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            r5 = 0
            r6 = r5
        L1b:
            if (r6 >= r3) goto L2b
            int r7 = r3 - r6
            int r7 = r2.read(r4, r6, r7)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            r8 = -1
            if (r7 != r8) goto L27
            goto L2b
        L27:
            int r6 = r6 + r7
            goto L1b
        L29:
            r0 = move-exception
            goto L4c
        L2b:
            if (r6 != 0) goto L2f
            r4 = r1
            goto L33
        L2f:
            com.google.android.gms.internal.ads.hz0 r4 = com.google.android.gms.internal.ads.jz0.OooOo0(r4, r5, r6)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
        L33:
            if (r4 != 0) goto L41
            com.google.android.gms.internal.ads.jz0 r0 = com.google.android.gms.internal.ads.jz0.OooOo00(r0)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            byte[] r0 = r0.OooO0o0()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            Oooo0OO.o00oO0o.OooO0Oo(r2)
            goto L58
        L41:
            r0.add(r4)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            int r3 = r3 + r3
            r4 = 8192(0x2000, float:1.148E-41)
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L54
            goto L17
        L4c:
            r1 = r2
            goto L4f
        L4e:
            r0 = move-exception
        L4f:
            Oooo0OO.o00oO0o.OooO0Oo(r1)
            throw r0
        L53:
            r2 = r1
        L54:
            Oooo0OO.o00oO0o.OooO0Oo(r2)
            r0 = r1
        L58:
            r9.f13521OooOoOO = r0
        L5a:
            java.lang.Object r0 = r9.f13521OooOoOO
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L61
            return r1
        L61:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOo0.o0OOO0o.OooOoOO():byte[]");
    }

    @Override // o00O00oO.o0000O0
    public Object get() {
        return new OooOo0O.OooO0OO((Executor) ((o0000O0) this.f13518OooOo0o).get(), (OooOOo.Oooo000) ((o0000O0) this.f13516OooOo).get(), (OooOo0o.OooOOO0) ((Oooo.OooOo00) this.f13520OooOoO0).get(), (OooOo.OooO0o) ((o0000O0) this.f13519OooOoO).get(), (OooOoO0.o0O0O00) ((o0000O0) this.f13521OooOoOO).get());
    }

    @Override // com.google.android.gms.internal.ads.o0o0000
    public int zza() {
        return ((long[]) this.f13516OooOo).length;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzc() {
        switch (this.f13517OooOo0O) {
            case 4:
                break;
            default:
                yi0 yi0Var = (yi0) this.f13518OooOo0o;
                if (yi0Var != null) {
                    if (yi0Var.isConnected() || yi0Var.isConnecting()) {
                        yi0Var.disconnect();
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zza(View view) {
        p80 p80Var = (p80) ((l80) this.f13521OooOoOO).f20828OooO0o0;
        h10 h10Var = new h10(new C1658hx(12, (byte) 0), null, 1);
        C1431bq c1431bqOooO00o = ((AbstractC1990qx) p80Var.f23242OooOo0o).OooO00o(new de0((rd0) this.f13516OooOo, (kd0) this.f13520OooOoO0, (String) null), h10Var);
        C1847n1 c1847n1 = new C1847n1(c1431bqOooO00o, 24);
        r80 r80Var = (r80) this.f13519OooOoO;
        synchronized (r80Var) {
            r80Var.f23803OooOo0O = c1847n1;
        }
        ((C2274yl) this.f13518OooOo0o).zzc(c1431bqOooO00o.o00o0O());
    }

    @Override // com.google.android.gms.internal.ads.o0o0000
    public long zzb(int i) {
        return ((long[]) this.f13516OooOo)[i];
    }

    public o0OOO0o(Context context, ExecutorService executorService, o0O0oo00 o0o0oo00, hi0 hi0Var, oi0 oi0Var, pi0 pi0Var) {
        this.f13517OooOo0O = 10;
        this.f13518OooOo0o = context;
        this.f13516OooOo = executorService;
        this.f13520OooOoO0 = o0o0oo00;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        mf0 mf0Var;
        mf0 mf0Var2;
        mf0 mf0Var3;
        mf0 mf0Var4;
        switch (this.f13517OooOo0O) {
            case 5:
                AbstractC1397at abstractC1397at = (AbstractC1397at) obj;
                synchronized (((s20) this.f13521OooOoOO)) {
                    try {
                        ((C2247xv) abstractC1397at.f17105OooO0oO.f25807OooOo0O.f21381OooOo0o).f25808OooOo0o = (c90) ((de0) ((s20) this.f13521OooOoOO).f23979OooOoO0).f18240OooOo;
                        ((C1847n1) this.f13518OooOo0o).OooO0o0(abstractC1397at);
                        ((C2130up) ((s20) this.f13521OooOoOO).f23977OooOo0o).OooO00o().execute(new RunnableC1580ft(this, 1));
                        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue() && (mf0Var = (mf0) this.f13516OooOo) != null) {
                            mf0Var.OooO0oO(abstractC1397at.f17099OooO00o.f23849OooO0O0);
                            mf0Var.OooO0o0(abstractC1397at.f17103OooO0o.f23118OooOo0O);
                            jf0 jf0Var = (jf0) this.f13520OooOoO0;
                            jf0Var.OooOO0(true);
                            mf0Var.OooO00o(jf0Var);
                            mf0Var.OooO0oo();
                        } else {
                            nf0 nf0Var = (nf0) ((s20) this.f13521OooOoOO).f23978OooOoO;
                            jf0 jf0Var2 = (jf0) this.f13520OooOoO0;
                            jf0Var2.OooO0OO(abstractC1397at.f17099OooO00o.f23849OooO0O0);
                            jf0Var2.OooO0o(abstractC1397at.f17103OooO0o.f23118OooOo0O);
                            jf0Var2.OooOO0(true);
                            nf0Var.OooO0O0(jf0Var2.zzm());
                        }
                    } finally {
                    }
                }
                return;
            case 6:
                AbstractC1397at abstractC1397at2 = (AbstractC1397at) obj;
                synchronized (((fc0) this.f13521OooOoOO)) {
                    try {
                        ((fc0) this.f13521OooOoOO).f18922OooOO0 = null;
                        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0ooOO)).booleanValue()) {
                            ((C2247xv) abstractC1397at2.f17105OooO0oO.f25807OooOo0O.f21381OooOo0o).f25810OooOoO0 = ((fc0) this.f13521OooOoOO).f18917OooO0Oo;
                        }
                        ((h90) this.f13518OooOo0o).OooO0o0(abstractC1397at2);
                        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue() && (mf0Var2 = (mf0) this.f13516OooOo) != null) {
                            mf0Var2.OooO0oO(abstractC1397at2.f17099OooO00o.f23849OooO0O0);
                            mf0Var2.OooO0o0(abstractC1397at2.f17103OooO0o.f23118OooOo0O);
                            jf0 jf0Var3 = (jf0) this.f13520OooOoO0;
                            jf0Var3.OooOO0(true);
                            mf0Var2.OooO00o(jf0Var3);
                            mf0Var2.OooO0oo();
                        } else {
                            nf0 nf0Var2 = ((fc0) this.f13521OooOoOO).f18921OooO0oo;
                            jf0 jf0Var4 = (jf0) this.f13520OooOoO0;
                            jf0Var4.OooO0OO(abstractC1397at2.f17099OooO00o.f23849OooO0O0);
                            jf0Var4.OooO0o(abstractC1397at2.f17103OooO0o.f23118OooOo0O);
                            jf0Var4.OooOO0(true);
                            nf0Var2.OooO0O0(jf0Var4.zzm());
                        }
                    } finally {
                    }
                }
                return;
            case 7:
                C1768kx c1768kx = (C1768kx) obj;
                synchronized (((yc0) this.f13521OooOoOO)) {
                    try {
                        ((yc0) this.f13521OooOoOO).f25896OooO = null;
                        C2148v6 c2148v6 = AbstractC1448c7.o0O0ooo0;
                        if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                            C1847n1 c1847n1 = c1768kx.f17105OooO0oO.f25807OooOo0O;
                            yc0 yc0Var = (yc0) this.f13521OooOoOO;
                            c90 c90Var = yc0Var.f25900OooO0Oo;
                            C2247xv c2247xv = (C2247xv) c1847n1.f21381OooOo0o;
                            c2247xv.f25808OooOo0o = c90Var;
                            c2247xv.f25809OooOoO = yc0Var.f25902OooO0o0;
                        }
                        ((h90) this.f13518OooOo0o).OooO0o0(c1768kx);
                        if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                            final int i = 0;
                            ((yc0) this.f13521OooOoOO).f25898OooO0O0.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xc0

                                /* renamed from: OooOo0o, reason: collision with root package name */
                                public final /* synthetic */ OooOOo0.o0OOO0o f25602OooOo0o;

                                {
                                    this.f25602OooOo0o = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i) {
                                        case 0:
                                            ((yc0) this.f25602OooOo0o.f13521OooOoOO).f25900OooO0Oo.OoooOOO();
                                            break;
                                        default:
                                            ((yc0) this.f25602OooOo0o.f13521OooOoOO).f25902OooO0o0.OoooOOO();
                                            break;
                                    }
                                }
                            });
                            final int i2 = 1;
                            ((yc0) this.f13521OooOoOO).f25898OooO0O0.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xc0

                                /* renamed from: OooOo0o, reason: collision with root package name */
                                public final /* synthetic */ OooOOo0.o0OOO0o f25602OooOo0o;

                                {
                                    this.f25602OooOo0o = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            ((yc0) this.f25602OooOo0o.f13521OooOoOO).f25900OooO0Oo.OoooOOO();
                                            break;
                                        default:
                                            ((yc0) this.f25602OooOo0o.f13521OooOoOO).f25902OooO0o0.OoooOOO();
                                            break;
                                    }
                                }
                            });
                        }
                        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue() && (mf0Var3 = (mf0) this.f13516OooOo) != null) {
                            mf0Var3.OooO0oO(c1768kx.f17099OooO00o.f23849OooO0O0);
                            mf0Var3.OooO0o0(c1768kx.f17103OooO0o.f23118OooOo0O);
                            jf0 jf0Var5 = (jf0) this.f13520OooOoO0;
                            jf0Var5.OooOO0(true);
                            mf0Var3.OooO00o(jf0Var5);
                            mf0Var3.OooO0oo();
                        } else {
                            nf0 nf0Var3 = ((yc0) this.f13521OooOoOO).f25903OooO0oO;
                            jf0 jf0Var6 = (jf0) this.f13520OooOoO0;
                            jf0Var6.OooO0OO(c1768kx.f17099OooO00o.f23849OooO0O0);
                            jf0Var6.OooO0o(c1768kx.f17103OooO0o.f23118OooOo0O);
                            jf0Var6.OooOO0(true);
                            nf0Var3.OooO0O0(jf0Var6.zzm());
                        }
                    } finally {
                    }
                }
                return;
            default:
                f10 f10Var = (f10) obj;
                synchronized (((fd0) this.f13521OooOoOO)) {
                    try {
                        ((C2247xv) f10Var.f17105OooO0oO.f25807OooOo0O.f21381OooOo0o).f25809OooOoO = ((fd0) this.f13521OooOoOO).f18927OooO0Oo;
                        ((h90) this.f13518OooOo0o).OooO0o0(f10Var);
                        fd0 fd0Var = (fd0) this.f13521OooOoOO;
                        Executor executor = fd0Var.f18925OooO0O0;
                        bd0 bd0Var = fd0Var.f18927OooO0Oo;
                        Objects.requireNonNull(bd0Var);
                        executor.execute(new b30(bd0Var, 12));
                        ((fd0) this.f13521OooOoOO).f18927OooO0Oo.onAdMetadataChanged();
                        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue() && (mf0Var4 = (mf0) this.f13516OooOo) != null) {
                            mf0Var4.OooO0oO(f10Var.f17099OooO00o.f23849OooO0O0);
                            mf0Var4.OooO0o0(f10Var.f17103OooO0o.f23118OooOo0O);
                            jf0 jf0Var7 = (jf0) this.f13520OooOoO0;
                            jf0Var7.OooOO0(true);
                            mf0Var4.OooO00o(jf0Var7);
                            mf0Var4.OooO0oo();
                        } else {
                            nf0 nf0Var4 = ((fd0) this.f13521OooOoOO).f18930OooO0oO;
                            jf0 jf0Var8 = (jf0) this.f13520OooOoO0;
                            jf0Var8.OooO0OO(f10Var.f17099OooO00o.f23849OooO0O0);
                            jf0Var8.OooO0o(f10Var.f17103OooO0o.f23118OooOo0O);
                            jf0Var8.OooOO0(true);
                            nf0Var4.OooO0O0(jf0Var8.zzm());
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public o0OOO0o(C2070t2 c2070t2, File file, File file2, File file3) {
        this.f13517OooOo0O = 11;
        this.f13518OooOo0o = c2070t2;
        this.f13516OooOo = file;
        this.f13520OooOoO0 = file3;
        this.f13519OooOoO = file2;
    }

    public /* synthetic */ o0OOO0o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f13517OooOo0O = i;
        this.f13518OooOo0o = obj;
        this.f13516OooOo = obj2;
        this.f13520OooOoO0 = obj3;
        this.f13519OooOoO = obj4;
        this.f13521OooOoOO = obj5;
    }

    public /* synthetic */ o0OOO0o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z) {
        this.f13517OooOo0O = i;
        this.f13518OooOo0o = obj2;
        this.f13516OooOo = obj3;
        this.f13520OooOoO0 = obj4;
        this.f13519OooOoO = obj5;
        this.f13521OooOoOO = obj;
    }

    public /* synthetic */ o0OOO0o(boolean z) {
        this.f13517OooOo0O = 19;
    }

    public o0OOO0o(Context context, String str, String str2) {
        this.f13517OooOo0O = 9;
        this.f13516OooOo = str;
        this.f13520OooOoO0 = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f13521OooOoOO = handlerThread;
        handlerThread.start();
        yi0 yi0Var = new yi0(9200000, this, this, context, handlerThread.getLooper());
        this.f13518OooOo0o = yi0Var;
        this.f13519OooOoO = new LinkedBlockingQueue();
        yi0Var.checkAvailabilityAndConnect();
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        mf0 mf0Var;
        zze zzeVarOooOo00;
        mf0 mf0Var2;
        mf0 mf0Var3;
        zze zzeVarOooOo002;
        mf0 mf0Var4;
        switch (this.f13517OooOo0O) {
            case 5:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo0)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
                }
                C2093tp c2093tp = (C2093tp) this.f13519OooOoO;
                zze zzeVarOooOo003 = af0.OooOo00(th, ((C1875nt) c2093tp.f24450o00O0O.zzb()).OooOO0o);
                ((C2098tu) c2093tp.f24428OoooooO.zzb()).o0OOO0o(zzeVarOooOo003);
                s20 s20Var = (s20) this.f13521OooOoOO;
                ((C2130up) s20Var.f23977OooOo0o).OooO00o().execute(new c60(2, this, zzeVarOooOo003));
                ze0.OooOoo0(zzeVarOooOo003.zza, "NativeAdLoader.onFailure", th);
                ((C1847n1) this.f13518OooOo0o).mo13707zza();
                boolean zBooleanValue = ((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue();
                jf0 jf0Var = (jf0) this.f13520OooOoO0;
                if (zBooleanValue && (mf0Var = (mf0) this.f13516OooOo) != null) {
                    mf0Var.OooO0OO(zzeVarOooOo003);
                    jf0Var.OooO0Oo(th);
                    jf0Var.OooOO0(false);
                    mf0Var.OooO00o(jf0Var);
                    mf0Var.OooO0oo();
                    return;
                }
                jf0Var.OooO0oo(zzeVarOooOo003);
                jf0Var.OooO0Oo(th);
                jf0Var.OooOO0(false);
                ((nf0) s20Var.f23978OooOoO).OooO0O0(jf0Var.zzm());
                return;
            case 6:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo0)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
                }
                AbstractC2243xr abstractC2243xr = (AbstractC2243xr) ((fc0) this.f13521OooOoOO).f18919OooO0o0.zzd();
                if (abstractC2243xr == null) {
                    zzeVarOooOo00 = af0.OooOo00(th, null);
                } else {
                    zzeVarOooOo00 = af0.OooOo00(th, ((C2241xp) abstractC2243xr).zzb().OooOO0o);
                }
                synchronized (((fc0) this.f13521OooOoOO)) {
                    try {
                        fc0 fc0Var = (fc0) this.f13521OooOoOO;
                        fc0Var.f18922OooOO0 = null;
                        if (abstractC2243xr != null) {
                            ((C2098tu) ((C2241xp) abstractC2243xr).f25777o0O0O00.zzb()).o0OOO0o(zzeVarOooOo00);
                            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0ooOO)).booleanValue()) {
                                ((fc0) this.f13521OooOoOO).f18915OooO0O0.execute(new c60(3, this, zzeVarOooOo00));
                            }
                        } else {
                            fc0Var.f18917OooO0Oo.o0OOO0o(zzeVarOooOo00);
                            ((fc0) this.f13521OooOoOO).OooO0O0((cc0) this.f13519OooOoO).OooO00o().zzb().f21590OooO0o.zzh();
                        }
                        ze0.OooOoo0(zzeVarOooOo00.zza, "AppOpenAdLoader.onFailure", th);
                        ((h90) this.f13518OooOo0o).mo13707zza();
                        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue() && (mf0Var2 = (mf0) this.f13516OooOo) != null) {
                            mf0Var2.OooO0OO(zzeVarOooOo00);
                            jf0 jf0Var2 = (jf0) this.f13520OooOoO0;
                            jf0Var2.OooO0Oo(th);
                            jf0Var2.OooOO0(false);
                            mf0Var2.OooO00o(jf0Var2);
                            mf0Var2.OooO0oo();
                        } else {
                            nf0 nf0Var = ((fc0) this.f13521OooOoOO).f18921OooO0oo;
                            jf0 jf0Var3 = (jf0) this.f13520OooOoO0;
                            jf0Var3.OooO0oo(zzeVarOooOo00);
                            jf0Var3.OooO0Oo(th);
                            jf0Var3.OooOO0(false);
                            nf0Var.OooO0O0(jf0Var3.zzm());
                        }
                    } finally {
                    }
                }
                return;
            case 7:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo0)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
                }
                final zze zzeVarOooOo004 = af0.OooOo00(th, ((C1875nt) ((C1503dq) this.f13519OooOoO).f18371o000OOo.zzb()).OooOO0o);
                synchronized (((yc0) this.f13521OooOoOO)) {
                    try {
                        ((yc0) this.f13521OooOoOO).f25896OooO = null;
                        ((C2098tu) ((C1503dq) this.f13519OooOoO).f18375o00o0O.zzb()).o0OOO0o(zzeVarOooOo004);
                        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0ooo0)).booleanValue()) {
                            final int i = 0;
                            ((yc0) this.f13521OooOoOO).f25898OooO0O0.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wc0

                                /* renamed from: OooOo0o, reason: collision with root package name */
                                public final /* synthetic */ OooOOo0.o0OOO0o f25293OooOo0o;

                                {
                                    this.f25293OooOo0o = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i) {
                                        case 0:
                                            ((yc0) this.f25293OooOo0o.f13521OooOoOO).f25900OooO0Oo.o0OOO0o(zzeVarOooOo004);
                                            break;
                                        default:
                                            ((yc0) this.f25293OooOo0o.f13521OooOoOO).f25902OooO0o0.o0OOO0o(zzeVarOooOo004);
                                            break;
                                    }
                                }
                            });
                            final int i2 = 1;
                            ((yc0) this.f13521OooOoOO).f25898OooO0O0.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wc0

                                /* renamed from: OooOo0o, reason: collision with root package name */
                                public final /* synthetic */ OooOOo0.o0OOO0o f25293OooOo0o;

                                {
                                    this.f25293OooOo0o = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            ((yc0) this.f25293OooOo0o.f13521OooOoOO).f25900OooO0Oo.o0OOO0o(zzeVarOooOo004);
                                            break;
                                        default:
                                            ((yc0) this.f25293OooOo0o.f13521OooOoOO).f25902OooO0o0.o0OOO0o(zzeVarOooOo004);
                                            break;
                                    }
                                }
                            });
                        }
                        ze0.OooOoo0(zzeVarOooOo004.zza, "InterstitialAdLoader.onFailure", th);
                        ((h90) this.f13518OooOo0o).mo13707zza();
                        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue() && (mf0Var3 = (mf0) this.f13516OooOo) != null) {
                            mf0Var3.OooO0OO(zzeVarOooOo004);
                            jf0 jf0Var4 = (jf0) this.f13520OooOoO0;
                            jf0Var4.OooO0Oo(th);
                            jf0Var4.OooOO0(false);
                            mf0Var3.OooO00o(jf0Var4);
                            mf0Var3.OooO0oo();
                        } else {
                            nf0 nf0Var2 = ((yc0) this.f13521OooOoOO).f25903OooO0oO;
                            jf0 jf0Var5 = (jf0) this.f13520OooOoO0;
                            jf0Var5.OooO0oo(zzeVarOooOo004);
                            jf0Var5.OooO0Oo(th);
                            jf0Var5.OooOO0(false);
                            nf0Var2.OooO0O0(jf0Var5.zzm());
                        }
                    } finally {
                    }
                }
                return;
            default:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo0)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
                }
                i10 i10Var = (i10) ((fd0) this.f13521OooOoOO).f18929OooO0o0.zzd();
                if (i10Var == null) {
                    zzeVarOooOo002 = af0.OooOo00(th, null);
                } else {
                    zzeVarOooOo002 = af0.OooOo00(th, ((C1577fq) i10Var).zzb().OooOO0o);
                }
                synchronized (((fd0) this.f13521OooOoOO)) {
                    try {
                        if (i10Var != null) {
                            ((C2098tu) ((C1577fq) i10Var).f19101o0O0O00.zzb()).o0OOO0o(zzeVarOooOo002);
                            ((fd0) this.f13521OooOoOO).f18925OooO0O0.execute(new c60(5, this, zzeVarOooOo002));
                        } else {
                            ((fd0) this.f13521OooOoOO).f18927OooO0Oo.o0OOO0o(zzeVarOooOo002);
                            ((fd0) this.f13521OooOoOO).OooO0O0((dd0) this.f13519OooOoO).OooO0O0().zzb().f21590OooO0o.zzh();
                        }
                        ze0.OooOoo0(zzeVarOooOo002.zza, "RewardedAdLoader.onFailure", th);
                        ((h90) this.f13518OooOo0o).mo13707zza();
                        if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue() && (mf0Var4 = (mf0) this.f13516OooOo) != null) {
                            mf0Var4.OooO0OO(zzeVarOooOo002);
                            jf0 jf0Var6 = (jf0) this.f13520OooOoO0;
                            jf0Var6.OooO0Oo(th);
                            jf0Var6.OooOO0(false);
                            mf0Var4.OooO00o(jf0Var6);
                            mf0Var4.OooO0oo();
                        } else {
                            nf0 nf0Var3 = ((fd0) this.f13521OooOoOO).f18930OooO0oO;
                            jf0 jf0Var7 = (jf0) this.f13520OooOoO0;
                            jf0Var7.OooO0oo(zzeVarOooOo002);
                            jf0Var7.OooO0Oo(th);
                            jf0Var7.OooOO0(false);
                            nf0Var3.OooO0O0(jf0Var7.zzm());
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public o0OOO0o(oO0O0OoO oo0o0ooo, HashMap map, HashMap map2, HashMap map3) {
        this.f13517OooOo0O = 2;
        this.f13518OooOo0o = oo0o0ooo;
        this.f13519OooOoO = map2;
        this.f13521OooOoOO = map3;
        this.f13520OooOoO0 = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        oo0o0ooo.OooO0oO(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f13516OooOo = jArr;
    }

    public o0OOO0o(Class cls, int i) {
        this.f13517OooOo0O = i;
        switch (i) {
            case 16:
                this.f13516OooOo = new ConcurrentHashMap();
                this.f13520OooOoO0 = new ArrayList();
                this.f13518OooOo0o = cls;
                this.f13521OooOoOO = o0000OO.OooO00o.f29381OooO0O0;
                break;
            default:
                this.f13516OooOo = new HashMap();
                this.f13520OooOoO0 = new ArrayList();
                this.f13518OooOo0o = cls;
                this.f13521OooOoOO = wt0.f25407OooO0O0;
                break;
        }
    }

    public o0OOO0o(Context context, o00O00OO.OooO0OO manager) {
        this.f13517OooOo0O = 17;
        kotlin.jvm.internal.OooOo.OooO0o0(manager, "manager");
        this.f13518OooOo0o = context;
        this.f13516OooOo = null;
        this.f13520OooOoO0 = manager;
        this.f13519OooOoO = o0OOO0.OooO0oo(new o000OO(this, 1));
        this.f13521OooOoOO = o0OOO0.OooO0oo(new com.ironsource.mediationsdk.OooO0OO(4));
    }

    private final void OooOo() {
    }

    public o0OOO0o(int i) {
        this.f13517OooOo0O = i;
        switch (i) {
            case 19:
                this.f13521OooOoOO = Collections.EMPTY_MAP;
                this.f13516OooOo = "GET";
                this.f13520OooOoO0 = new o000Ooo.o00oO0o(15);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOO0o(o00O0O.OooO oooO) {
        this.f13517OooOo0O = 18;
        this.f13518OooOo0o = (ViewGroup) oooO;
        View view = (View) oooO;
        this.f13516OooOo = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f13520OooOoO0 = paint;
        paint.setColor(0);
    }
}
