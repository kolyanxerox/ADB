package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class oo000o {

    /* renamed from: OooO00o */
    public final Object f26892OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f26893OooO0O0;

    public /* synthetic */ oo000o(Object obj, Object obj2) {
        this.f26892OooO00o = obj;
        this.f26893OooO0O0 = obj2;
    }

    public Object OooO00o() {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        o0OOO00 o0ooo00 = (o0OOO00) this.f26892OooO00o;
        String str = (String) this.f26893OooO0O0;
        Context context = (Context) o0ooo00.f26564OooOo0o;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        o000O0Oo.OooO0o oooO0o = oo0oO0.f26909OooO00o;
        if (contentResolver == null) {
            oooO0o.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (oooO0o) {
            try {
                if (((HashMap) oooO0o.f30136OooOo) == null) {
                    ((AtomicBoolean) oooO0o.f30138OooOo0o).set(false);
                    oooO0o.f30136OooOo = new HashMap(16, 1.0f);
                    oooO0o.f30142OooOoo = new Object();
                    contentResolver.registerContentObserver(oo0ooO.f26910OooO00o, true, new o0OO00o0(oooO0o));
                } else if (((AtomicBoolean) oooO0o.f30138OooOo0o).getAndSet(false)) {
                    ((HashMap) oooO0o.f30136OooOo).clear();
                    ((HashMap) oooO0o.f30140OooOoO0).clear();
                    ((HashMap) oooO0o.f30139OooOoO).clear();
                    ((HashMap) oooO0o.f30141OooOoOO).clear();
                    ((HashMap) oooO0o.f30143OooOoo0).clear();
                    oooO0o.f30142OooOoo = new Object();
                }
                Object obj = oooO0o.f30142OooOoo;
                String str2 = null;
                if (((HashMap) oooO0o.f30136OooOo).containsKey(str)) {
                    String str3 = (String) ((HashMap) oooO0o.f30136OooOo).get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                try {
                    uri = oo0ooO.f26910OooO00o;
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                    } finally {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                } catch (o0OO0 unused) {
                }
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new o0OO0("Unable to acquire ContentProviderClient");
                }
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                    try {
                        if (cursorQuery == null) {
                            throw new o0OO0("ContentProvider query returned null cursor");
                        }
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(1);
                            cursorQuery.close();
                        } else {
                            cursorQuery.close();
                            string = null;
                        }
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        synchronized (oooO0o) {
                            try {
                                if (obj == oooO0o.f30142OooOoo) {
                                    ((HashMap) oooO0o.f30136OooOo).put(str, string);
                                }
                            } finally {
                            }
                        }
                        if (string != null) {
                            return string;
                        }
                        return null;
                    } finally {
                    }
                } catch (RemoteException e) {
                    throw new o0OO0("ContentProvider query failed", e);
                }
            } finally {
            }
        }
    }

    public void OooO0O0(o00Ooo o00ooo2) {
        ArrayList arrayList = o00ooo2.f26533OooO00o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.f26892OooO00o).put(Integer.valueOf(((o0OOO0o) obj).f26628OooOo0O).toString(), o00ooo2);
        }
    }

    public Oooo0 OooO0OO(C2051sk c2051sk, Oooo0 oooo0) {
        o00O0.o000OOo.OooOo(c2051sk);
        if (!(oooo0 instanceof o000oOoO)) {
            return oooo0;
        }
        o000oOoO o000oooo2 = (o000oOoO) oooo0;
        ArrayList arrayList = o000oooo2.f26510OooOo0o;
        HashMap map = (HashMap) this.f26892OooO00o;
        String str = o000oooo2.f26509OooOo0O;
        return (map.containsKey(str) ? (o00Ooo) map.get(str) : (o00Ooo) this.f26893OooO0O0).OooO00o(str, c2051sk, arrayList);
    }

    public void OooO0Oo(C2051sk c2051sk, Oooo.OooOo00 oooOo00) {
        oO0000O oo0000o = new oO0000O(oooOo00);
        TreeMap treeMap = (TreeMap) this.f26892OooO00o;
        for (Integer num : treeMap.keySet()) {
            OooO0O0 oooO0O0Clone = ((OooO0O0) oooOo00.f13710OooOo).clone();
            Oooo0 oooo0OooO00o = ((Oooo000) treeMap.get(num)).OooO00o(c2051sk, Collections.singletonList(oo0000o));
            int iOooOo00 = oooo0OooO00o instanceof OooOO0O ? o00O0.o000OOo.OooOo00(((OooOO0O) oooo0OooO00o).f26425OooOo0O.doubleValue()) : -1;
            if (iOooOo00 == 2 || iOooOo00 == -1) {
                oooOo00.f13710OooOo = oooO0O0Clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f26893OooO0O0;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            Oooo0 oooo0OooO00o2 = ((Oooo000) treeMap2.get((Integer) it.next())).OooO00o(c2051sk, Collections.singletonList(oo0000o));
            if (oooo0OooO00o2 instanceof OooOO0O) {
                o00O0.o000OOo.OooOo00(((OooOO0O) oooo0OooO00o2).f26425OooOo0O.doubleValue());
            }
        }
    }

    public oo000o(int i) {
        switch (i) {
            case 3:
                this.f26892OooO00o = new TreeMap();
                this.f26893OooO0O0 = new TreeMap();
                break;
            default:
                this.f26892OooO00o = new HashMap();
                this.f26893OooO0O0 = new o00Ooo(6);
                o00Ooo o00ooo2 = new o00Ooo(0);
                ArrayList arrayList = o00ooo2.f26533OooO00o;
                arrayList.add(o0OOO0o.BITWISE_AND);
                arrayList.add(o0OOO0o.BITWISE_LEFT_SHIFT);
                arrayList.add(o0OOO0o.BITWISE_NOT);
                arrayList.add(o0OOO0o.BITWISE_OR);
                arrayList.add(o0OOO0o.BITWISE_RIGHT_SHIFT);
                arrayList.add(o0OOO0o.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(o0OOO0o.BITWISE_XOR);
                OooO0O0(o00ooo2);
                o00Ooo o00ooo3 = new o00Ooo(1);
                ArrayList arrayList2 = o00ooo3.f26533OooO00o;
                arrayList2.add(o0OOO0o.EQUALS);
                arrayList2.add(o0OOO0o.GREATER_THAN);
                arrayList2.add(o0OOO0o.GREATER_THAN_EQUALS);
                arrayList2.add(o0OOO0o.IDENTITY_EQUALS);
                arrayList2.add(o0OOO0o.IDENTITY_NOT_EQUALS);
                arrayList2.add(o0OOO0o.LESS_THAN);
                arrayList2.add(o0OOO0o.LESS_THAN_EQUALS);
                arrayList2.add(o0OOO0o.NOT_EQUALS);
                OooO0O0(o00ooo3);
                o00Ooo o00ooo4 = new o00Ooo(2);
                ArrayList arrayList3 = o00ooo4.f26533OooO00o;
                arrayList3.add(o0OOO0o.APPLY);
                arrayList3.add(o0OOO0o.BLOCK);
                arrayList3.add(o0OOO0o.BREAK);
                arrayList3.add(o0OOO0o.CASE);
                arrayList3.add(o0OOO0o.DEFAULT);
                arrayList3.add(o0OOO0o.CONTINUE);
                arrayList3.add(o0OOO0o.DEFINE_FUNCTION);
                arrayList3.add(o0OOO0o.FN);
                arrayList3.add(o0OOO0o.IF);
                arrayList3.add(o0OOO0o.QUOTE);
                arrayList3.add(o0OOO0o.RETURN);
                arrayList3.add(o0OOO0o.SWITCH);
                arrayList3.add(o0OOO0o.TERNARY);
                OooO0O0(o00ooo4);
                o00Ooo o00ooo5 = new o00Ooo(3);
                ArrayList arrayList4 = o00ooo5.f26533OooO00o;
                arrayList4.add(o0OOO0o.AND);
                arrayList4.add(o0OOO0o.NOT);
                arrayList4.add(o0OOO0o.OR);
                OooO0O0(o00ooo5);
                o00Ooo o00ooo6 = new o00Ooo(4);
                ArrayList arrayList5 = o00ooo6.f26533OooO00o;
                arrayList5.add(o0OOO0o.FOR_IN);
                arrayList5.add(o0OOO0o.FOR_IN_CONST);
                arrayList5.add(o0OOO0o.FOR_IN_LET);
                arrayList5.add(o0OOO0o.FOR_LET);
                arrayList5.add(o0OOO0o.FOR_OF);
                arrayList5.add(o0OOO0o.FOR_OF_CONST);
                arrayList5.add(o0OOO0o.FOR_OF_LET);
                arrayList5.add(o0OOO0o.WHILE);
                OooO0O0(o00ooo6);
                o00Ooo o00ooo7 = new o00Ooo(5);
                ArrayList arrayList6 = o00ooo7.f26533OooO00o;
                arrayList6.add(o0OOO0o.ADD);
                arrayList6.add(o0OOO0o.DIVIDE);
                arrayList6.add(o0OOO0o.MODULUS);
                arrayList6.add(o0OOO0o.MULTIPLY);
                arrayList6.add(o0OOO0o.NEGATE);
                arrayList6.add(o0OOO0o.POST_DECREMENT);
                arrayList6.add(o0OOO0o.POST_INCREMENT);
                arrayList6.add(o0OOO0o.PRE_DECREMENT);
                arrayList6.add(o0OOO0o.PRE_INCREMENT);
                arrayList6.add(o0OOO0o.SUBTRACT);
                OooO0O0(o00ooo7);
                o00Ooo o00ooo8 = new o00Ooo(7);
                ArrayList arrayList7 = o00ooo8.f26533OooO00o;
                arrayList7.add(o0OOO0o.ASSIGN);
                arrayList7.add(o0OOO0o.CONST);
                arrayList7.add(o0OOO0o.CREATE_ARRAY);
                arrayList7.add(o0OOO0o.CREATE_OBJECT);
                arrayList7.add(o0OOO0o.EXPRESSION_LIST);
                arrayList7.add(o0OOO0o.GET);
                arrayList7.add(o0OOO0o.GET_INDEX);
                arrayList7.add(o0OOO0o.GET_PROPERTY);
                arrayList7.add(o0OOO0o.NULL);
                arrayList7.add(o0OOO0o.SET_PROPERTY);
                arrayList7.add(o0OOO0o.TYPEOF);
                arrayList7.add(o0OOO0o.UNDEFINED);
                arrayList7.add(o0OOO0o.VAR);
                OooO0O0(o00ooo8);
                break;
        }
    }
}
