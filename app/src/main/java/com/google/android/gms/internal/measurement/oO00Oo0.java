package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.ads.pz0;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oO00Oo0 implements o00000o0.o000000, oO0OOO00 {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final oO0Oo0oo f26699OooOo0o = new oO0Oo0oo(3);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f26700OooOo0O;

    public /* synthetic */ oO00Oo0(Object obj) {
        this.f26700OooOo0O = obj;
    }

    @Override // com.google.android.gms.internal.measurement.oO0OOO00
    public boolean OooO00o(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((oO0OOO00[]) this.f26700OooOo0O)[i].OooO00o(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.oO0OOO00
    public oOo000o0 OooO0O0(Class cls) {
        for (int i = 0; i < 2; i++) {
            oO0OOO00 oo0ooo00 = ((oO0OOO00[]) this.f26700OooOo0O)[i];
            if (oo0ooo00.OooO00o(cls)) {
                return oo0ooo00.OooO0O0(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public /* synthetic */ Object OooO0OO() {
        o0OO0o o0oo0o = (o0OO0o) this.f26700OooOo0O;
        ContentResolver contentResolver = o0oo0o.f26548OooO00o;
        Uri uri = o0oo0o.f26549OooO0O0;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, o0OO0o.f26547OooOO0, null, null, null);
            try {
                if (cursorQuery == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return arrayMap;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public void OooO0Oo(int i, Object obj, oO0 oo0) throws pz0 {
        AbstractC2346o abstractC2346o = (AbstractC2346o) obj;
        oO000O0 oo000o0 = (oO000O0) this.f26700OooOo0O;
        oo000o0.OooOo0((i << 3) | 2);
        oo000o0.OooOo0(abstractC2346o.OooO0O0(oo0));
        oo0.OooO0Oo(abstractC2346o, oo000o0.f26676OooO0Oo);
    }

    public void OooO0o0(int i, Object obj, oO0 oo0) throws pz0 {
        oO000O0 oo000o0 = (oO000O0) this.f26700OooOo0O;
        oo000o0.OooOO0o(i, 3);
        oo0.OooO0Oo((AbstractC2346o) obj, oo000o0.f26676OooO0Oo);
        oo000o0.OooOO0o(i, 4);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[Catch: all -> 0x002a, TryCatch #4 {all -> 0x002a, all -> 0x0072, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0021, B:20:0x003e, B:74:0x0183, B:15:0x002d, B:17:0x0035, B:21:0x0043, B:23:0x0049, B:24:0x004d, B:73:0x0180, B:75:0x0186, B:76:0x0189, B:77:0x018a, B:25:0x0052, B:27:0x0056, B:28:0x0063, B:30:0x0069, B:36:0x007f, B:38:0x0085, B:39:0x0091, B:60:0x0164, B:61:0x0167, B:69:0x0177, B:68:0x0174, B:70:0x0178, B:71:0x017d, B:72:0x017e, B:31:0x006f, B:35:0x0076), top: B:89:0x000f }] */
    @Override // o00000o0.o000000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.oO00Oo0.get():java.lang.Object");
    }

    public oO00Oo0(int i) {
        switch (i) {
            case 1:
                this.f26700OooOo0O = new HashMap();
                break;
            default:
                oOo000Oo ooo000oo = oOo000Oo.f26877OooO0OO;
                oO00Oo0 oo00oo0 = new oO00Oo0(new oO0OOO00[]{oO0Oo0oo.f26758OooOo0o, f26699OooOo0o});
                Charset charset = oO00O0o.f26684OooO00o;
                this.f26700OooOo0O = oo00oo0;
                break;
        }
    }

    public oO00Oo0(oO000O0 oo000o0) {
        Charset charset = oO00O0o.f26684OooO00o;
        this.f26700OooOo0O = oo000o0;
        oo000o0.f26676OooO0Oo = this;
    }
}
