package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3037dc;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ii */
/* loaded from: classes2.dex */
public final class C2867ii {

    /* renamed from: ﱡ */
    private static int f6768 = 0;

    /* renamed from: ﻏ */
    private static int f6769 = 1;

    /* renamed from: ﻛ */
    private static char[] f6770;

    /* renamed from: ｋ */
    private static final String[] f6771;

    /* renamed from: ﾒ */
    private static char f6772;

    /* renamed from: ﻐ */
    private final d f6773;

    /* renamed from: ﾇ */
    private final SQLiteDatabase f6774;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ii$d */
    public static class d extends SQLiteOpenHelper {

        /* renamed from: ﻐ */
        private static int f6775 = 0;

        /* renamed from: ﾇ */
        private static char[] f6776 = {151, 301, 303, 299, 298, 301, 308, 288, 267, 275, 276, 278, 270, 265, 271, 268, 245, 264, 303, 309, 304, 20, '>', 'V', 'N', 'L', ':', 'F', 'f', 'k', 'K', '&', 'B', 'O', 'H', '5', '<', 'U', 'I', 'G', 'K', 'M', 'Q', '8', ':', 'V', 'N', 'L', ':', 'L', 'o', 'h', 'I', 'F', 'k', 'p', 'q', 's', 'i', 'j', 'p', 'E', '9', 'S', 'S', 'N', 'P', 'N', '2', ':', 'Q', 'N', '7', '3', 'G', '4', '2', 'H', 'G', 'A', 'J', ':', '2', 'L', 'J', 'C', 'K', 'J'};

        /* renamed from: ﾒ */
        private static int f6777 = 1;

        public d(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* renamed from: ﾇ */
        private static String m7107(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
            String str2;
            byte[] bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = bytes;
            synchronized (C2831h.f6553) {
                try {
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int i3 = iArr[2];
                    int i4 = iArr[3];
                    char[] cArr = new char[i2];
                    System.arraycopy(f6776, i, cArr, 0, i2);
                    if (bArr != null) {
                        char[] cArr2 = new char[i2];
                        C2831h.f6552 = 0;
                        char c = 0;
                        while (true) {
                            int i5 = C2831h.f6552;
                            if (i5 >= i2) {
                                break;
                            }
                            if (bArr[i5] == 1) {
                                cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                            } else {
                                cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                            }
                            c = cArr2[i5];
                            C2831h.f6552 = i5 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i4 > 0) {
                        char[] cArr3 = new char[i2];
                        System.arraycopy(cArr, 0, cArr3, 0, i2);
                        int i6 = i2 - i4;
                        System.arraycopy(cArr3, 0, cArr, i6, i4);
                        System.arraycopy(cArr3, i4, cArr, 0, i6);
                    }
                    if (z) {
                        char[] cArr4 = new char[i2];
                        C2831h.f6552 = 0;
                        while (true) {
                            int i7 = C2831h.f6552;
                            if (i7 >= i2) {
                                break;
                            }
                            cArr4[i7] = cArr[(i2 - i7) - 1];
                            C2831h.f6552 = i7 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i3 > 0) {
                        C2831h.f6552 = 0;
                        while (true) {
                            int i8 = C2831h.f6552;
                            if (i8 >= i2) {
                                break;
                            }
                            cArr[i8] = (char) (cArr[i8] - iArr[2]);
                            C2831h.f6552 = i8 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            if (!sQLiteDatabase.isReadOnly()) {
                int i = f6775 + 95;
                f6777 = i % 128;
                sQLiteDatabase.execSQL((i % 2 == 0 ? m7107(false, new int[]{0, 21, 197, 10}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001") : m7107(false, new int[]{0, 21, 197, 10}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001")).intern());
            }
            sQLiteDatabase.execSQL(m7107(true, new int[]{21, 67, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001").intern());
            int i2 = f6777 + 121;
            f6775 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = f6777 + 123;
            f6775 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        m7100();
        f6771 = new String[]{m7101((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 16), "\u0004\u0000\u0089", 3 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m7101((byte) (61 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0001\u0002©", 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()};
        int i = f6768 + 119;
        f6769 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public C2867ii(Context context, String str) {
        d dVar = new d(context, str);
        this.f6773 = dVar;
        this.f6774 = dVar.getWritableDatabase();
    }

    /* renamed from: ﻛ */
    public static void m7100() {
        f6772 = (char) 5;
        f6770 = new char[]{'v', 'a', 'l', 'k', 'e', 'y', ' ', C3037dc.f8244T, '?', '_', 's', 't', 'o', 'r', 'L', 'I', 'K', 'E', 'C', 'O', 'U', 'N', 'T', '(', ')'};
    }

    /* renamed from: ﻐ */
    public final synchronized void m7102(String str, String str2) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(m7101((byte) (60 - TextUtils.lastIndexOf("", '0', 0)), "\u0001\u0002©", View.getDefaultSize(0, 0) + 3).intern(), str2);
            if (this.f6774.update(m7101((byte) (33 - KeyEvent.keyCodeFromString("")), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), contentValues, m7101((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + InterfaceC3173h3.d.b.f8825h), "\u0004\u0000\u0006\u0007\b\u0007\u00ad", 7 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new String[]{str}) == 0) {
                f6769 = (f6768 + 7) % 128;
                contentValues.put(m7101((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 16), "\u0004\u0000\u0089", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4).intern(), str);
                this.f6774.replace(m7101((byte) ((Process.myPid() >> 22) + 33), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", View.MeasureSpec.getMode(0) + 8).intern(), null, contentValues);
            }
            int i = f6769 + 75;
            f6768 = i % 128;
            if (i % 2 != 0) {
                int i2 = 40 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﾇ */
    public final synchronized HashMap<String, String> m7105(String str, int i) {
        String string;
        HashMap<String, String> map;
        Cursor cursorQuery = null;
        try {
            try {
                String strReplace = str.replace('*', '%');
                String strIntern = m7101((byte) (TextUtils.lastIndexOf("", '0') + 26), "\u0004\u0000\u0006\u0007\n\u0013\u0011\u0012\u0007\t", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9).intern();
                String[] strArr = {strReplace};
                if (i <= 0) {
                    int i2 = f6769 + 95;
                    f6768 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 5 / 0;
                    }
                    string = null;
                } else {
                    string = Integer.toString(i);
                }
                cursorQuery = this.f6774.query(m7101((byte) (View.resolveSize(0, 0) + 33), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", 7 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), f6771, strIntern, strArr, null, null, null, string);
                map = new HashMap<>();
                while (cursorQuery != null) {
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    try {
                        map.put(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m7101((byte) (16 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0004\u0000\u0089", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3).intern())), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m7101((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 61), "\u0001\u0002©", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3).intern())));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                f6769 = (f6768 + 31) % 128;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    /* renamed from: ﾒ */
    public final synchronized String m7106(String str) {
        f6769 = (f6768 + 119) % 128;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f6774.query(m7101((byte) (AndroidCharacter.getMirror('0') - 15), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", TextUtils.indexOf((CharSequence) "", '0') + 9).intern(), f6771, m7101((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + InterfaceC3173h3.d.b.f8825h), "\u0004\u0000\u0006\u0007\b\u0007\u00ad", 8 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        int i = f6769 + 55;
                        f6768 = i % 128;
                        String string = cursorQuery.getString(i % 2 != 0 ? cursorQuery.getColumnIndexOrThrow(m7101((byte) ((ViewConfiguration.getDoubleTapTimeout() << 35) * 59), "\u0001\u0002©", 4 >> ExpandableListView.getPackedPositionType(1L)).intern()) : cursorQuery.getColumnIndexOrThrow(m7101((byte) (61 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0001\u0002©", ExpandableListView.getPackedPositionType(0L) + 3).intern()));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ﻛ */
    public final synchronized void m7103(String str) {
        f6769 = (f6768 + 73) % 128;
        this.f6774.delete(m7101((byte) (32 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", Process.getGidForName("") + 9).intern(), m7101((byte) (82 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0004\u0000\u0006\b\u0090", AndroidCharacter.getMirror('0') - '+').intern(), new String[]{str});
        int i = f6769 + 115;
        f6768 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    private static String m7101(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6770;
                char c = f6772;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C2858i.f6715 = 0;
                    while (true) {
                        int i2 = C2858i.f6715;
                        if (i2 >= i) {
                            break;
                        }
                        C2858i.f6714 = cArr[i2];
                        C2858i.f6712 = cArr[C2858i.f6715 + 1];
                        if (C2858i.f6714 == C2858i.f6712) {
                            cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                            cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                        } else {
                            C2858i.f6713 = C2858i.f6714 / c;
                            C2858i.f6709 = C2858i.f6714 % c;
                            C2858i.f6711 = C2858i.f6712 / c;
                            C2858i.f6708 = C2858i.f6712 % c;
                            if (C2858i.f6709 == C2858i.f6708) {
                                C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i5 = C2858i.f6715;
                                cArr3[i5] = cArr2[i3];
                                cArr3[i5 + 1] = cArr2[i4];
                            } else if (C2858i.f6713 == C2858i.f6711) {
                                C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i8 = C2858i.f6715;
                                cArr3[i8] = cArr2[i6];
                                cArr3[i8 + 1] = cArr2[i7];
                            } else {
                                int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                int i11 = C2858i.f6715;
                                cArr3[i11] = cArr2[i9];
                                cArr3[i11 + 1] = cArr2[i10];
                            }
                        }
                        C2858i.f6715 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﾇ */
    public final synchronized int m7104(String str) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.f6774.query(m7101((byte) (33 - View.MeasureSpec.getSize(0)), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", 8 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new String[]{m7101((byte) (70 - Color.green(0)), "\u0013\u000f\u0015\u0016\u0017\u0018\u0001\u0002\u0004\u0016", 10 - Color.argb(0, 0, 0, 0)).intern()}, m7101((byte) (TextUtils.indexOf("", "", 0) + 25), "\u0004\u0000\u0006\u0007\n\u0013\u0011\u0012\u0007\t", 10 - View.resolveSize(0, 0)).intern(), new String[]{str.replace('*', '%')}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return 0;
            }
            f6769 = (f6768 + 21) % 128;
            int i = cursorQuery.getInt(0);
            f6769 = (f6768 + 21) % 128;
            cursorQuery.close();
            return i;
        } finally {
        }
    }
}
