package o000oOoo;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o00O0.o000OOo;
import o00O0.oo000o;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oO.o000000;
import o00O0oO.o0000O00;
import o00O0oOo.o000OO;
import oo00o.OooOo;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public final class o000Oo0 extends OooOOOO implements o00O0O {

    /* renamed from: OooOo */
    public final /* synthetic */ Activity f31012OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ Intent f31013OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ o0000OO0 f31014OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ boolean f31015OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ int f31016OooOoO0;

    /* renamed from: OooOoOO */
    public final /* synthetic */ String f31017OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(Intent intent, o0000OO0 o0000oo02, Activity activity, int i, boolean z, String str, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31013OooOo0O = intent;
        this.f31014OooOo0o = o0000oo02;
        this.f31012OooOo = activity;
        this.f31016OooOoO0 = i;
        this.f31015OooOoO = z;
        this.f31017OooOoOO = str;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new o000Oo0(this.f31013OooOo0O, this.f31014OooOo0o, this.f31012OooOo, this.f31016OooOoO0, this.f31015OooOoO, this.f31017OooOoOO, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        o000Oo0 o000oo02 = (o000Oo0) create((o000OO) obj, (OooO0OO) obj2);
        OooOo oooOo = OooOo.f33195OooO00o;
        o000oo02.invokeSuspend(oooOo);
        return oooOo;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        String strSubstring;
        List listOooOO0o;
        String separator;
        String strConcat;
        List listOooOO0o2;
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        o000OOo.OooOO0O(obj);
        OooOo oooOo = OooOo.f33195OooO00o;
        o0000OO0 o0000oo02 = this.f31014OooOo0o;
        Intent intent = this.f31013OooOo0O;
        if (intent == null) {
            o0000oo02.OooO0O0("unknown_activity", "Unknown activity error, please fill an issue.");
            return oooOo;
        }
        ArrayList arrayList = new ArrayList();
        ClipData clipData = intent.getClipData();
        Activity activity = this.f31012OooOo;
        int i = 0;
        int i2 = this.f31016OooOoO0;
        boolean z = this.f31015OooOoO;
        if (clipData != null) {
            ClipData clipData2 = intent.getClipData();
            kotlin.jvm.internal.OooOo.OooO0O0(clipData2);
            int itemCount = clipData2.getItemCount();
            while (i < itemCount) {
                ClipData clipData3 = intent.getClipData();
                kotlin.jvm.internal.OooOo.OooO0O0(clipData3);
                Uri uri = clipData3.getItemAt(i).getUri();
                kotlin.jvm.internal.OooOo.OooO0O0(uri);
                o000O00.OooO00o(activity, o000O00.OooO0O0(activity, uri, i2), z, arrayList);
                i++;
            }
            o0000oo02.OooO0OO(arrayList);
            return oooOo;
        }
        if (intent.getData() == null) {
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("selectedItems")) {
                o0000oo02.OooO0O0("unknown_activity", "Unknown activity error, please fill an issue.");
                return oooOo;
            }
            Bundle extras2 = intent.getExtras();
            kotlin.jvm.internal.OooOo.OooO0O0(extras2);
            ArrayList arrayListOooO0oO = o000O00.OooO0oO(extras2);
            if (arrayListOooO0oO != null) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayListOooO0oO.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayListOooO0oO.get(i3);
                    i3++;
                    if (obj2 instanceof Uri) {
                        arrayList2.add(obj2);
                    }
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    o000O00.OooO00o(activity, (Uri) obj3, z, arrayList);
                }
            }
            o0000oo02.OooO0OO(arrayList);
            return oooOo;
        }
        Uri data = intent.getData();
        kotlin.jvm.internal.OooOo.OooO0O0(data);
        Uri uriOooO0O0 = o000O00.OooO0O0(activity, data, i2);
        if (!this.f31017OooOoOO.equals("dir")) {
            o000O00.OooO00o(activity, uriOooO0O0, z, arrayList);
            if (arrayList.isEmpty()) {
                o0000oo02.OooO0O0("unknown_path", "Failed to retrieve path.");
                return oooOo;
            }
            o0000oo02.OooO0OO(arrayList);
            return oooOo;
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uriOooO0O0, DocumentsContract.getTreeDocumentId(uriOooO0O0));
        kotlin.jvm.internal.OooOo.OooO0Oo(uriBuildDocumentUriUsingTree, "buildDocumentUriUsingTree(...)");
        int i4 = Build.VERSION.SDK_INT;
        Collection collectionOooo0O0 = oo000o.f31251OooOo0O;
        if (i4 >= 30 || !kotlin.jvm.internal.OooOo.OooO00o(uriBuildDocumentUriUsingTree.getAuthority(), "com.android.providers.downloads.documents")) {
            String treeDocumentId = DocumentsContract.getTreeDocumentId(uriBuildDocumentUriUsingTree);
            kotlin.jvm.internal.OooOo.OooO0O0(treeDocumentId);
            List listOoooo0o = o000000.Ooooo0o(treeDocumentId, new String[]{TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER});
            if (listOoooo0o.size() > 1) {
                String str = (String) listOoooo0o.get(0);
                String str2 = (String) listOoooo0o.get(1);
                if ("primary".equalsIgnoreCase(str)) {
                    strSubstring = Environment.getExternalStorageDirectory() + '/' + str2;
                } else {
                    strSubstring = "/storage/" + str + '/' + str2;
                }
            } else {
                strSubstring = Environment.getExternalStorageDirectory() + '/' + ((String) o00O0.OooOo00.Oooo000(listOoooo0o));
            }
            String separator2 = File.separator;
            kotlin.jvm.internal.OooOo.OooO0Oo(separator2, "separator");
            if (o0000O00.OooOooo(strSubstring, separator2, false)) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                kotlin.jvm.internal.OooOo.OooO0Oo(strSubstring, "substring(...)");
            }
            String treeDocumentId2 = DocumentsContract.getTreeDocumentId(uriBuildDocumentUriUsingTree);
            kotlin.jvm.internal.OooOo.OooO0O0(treeDocumentId2);
            Pattern patternCompile = Pattern.compile(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            kotlin.jvm.internal.OooOo.OooO0Oo(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(treeDocumentId2);
            if (matcher.find()) {
                ArrayList arrayList3 = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList3.add(treeDocumentId2.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList3.add(treeDocumentId2.subSequence(iEnd, treeDocumentId2.length()).toString());
                listOooOO0o = arrayList3;
            } else {
                listOooOO0o = o0OO0O0.OooOO0o(treeDocumentId2.toString());
            }
            if (!listOooOO0o.isEmpty()) {
                ListIterator listIterator = listOooOO0o.listIterator(listOooOO0o.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionOooo0O0 = o00O0.OooOo00.Oooo0O0(listIterator.nextIndex() + 1, listOooOO0o);
                        break;
                    }
                }
            }
            String[] strArr = (String[]) collectionOooo0O0.toArray(new String[0]);
            if (strArr.length >= 2) {
                separator = strArr[1];
            } else {
                separator = File.separator;
                kotlin.jvm.internal.OooOo.OooO0Oo(separator, "separator");
            }
            String separator3 = File.separator;
            kotlin.jvm.internal.OooOo.OooO0Oo(separator3, "separator");
            if (o0000O00.OooOooo(separator, separator3, false)) {
                separator = separator.substring(0, separator.length() - 1);
                kotlin.jvm.internal.OooOo.OooO0Oo(separator, "substring(...)");
            }
            strConcat = (separator.length() <= 0 || o0000O00.OooOooo(strSubstring, separator, false)) ? strSubstring : o0000O00.Oooo0OO(separator, separator3, false) ? strSubstring.concat(separator) : OooO0oO.OooOo.OooOoo(strSubstring, separator3, separator);
        } else {
            String documentId = DocumentsContract.getDocumentId(uriBuildDocumentUriUsingTree);
            strConcat = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            if (!kotlin.jvm.internal.OooOo.OooO00o(documentId, "downloads")) {
                kotlin.jvm.internal.OooOo.OooO0O0(documentId);
                Pattern patternCompile2 = Pattern.compile("^ms[df]:.*");
                kotlin.jvm.internal.OooOo.OooO0Oo(patternCompile2, "compile(...)");
                if (patternCompile2.matcher(documentId).matches()) {
                    strConcat = strConcat + '/' + o000O00.OooO0o0(activity, uriBuildDocumentUriUsingTree);
                } else if (o0000O00.Oooo0OO(documentId, "raw:", false)) {
                    Pattern patternCompile3 = Pattern.compile(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    kotlin.jvm.internal.OooOo.OooO0Oo(patternCompile3, "compile(...)");
                    Matcher matcher2 = patternCompile3.matcher(documentId);
                    if (matcher2.find()) {
                        ArrayList arrayList4 = new ArrayList(10);
                        int iEnd2 = 0;
                        do {
                            arrayList4.add(documentId.subSequence(iEnd2, matcher2.start()).toString());
                            iEnd2 = matcher2.end();
                        } while (matcher2.find());
                        arrayList4.add(documentId.subSequence(iEnd2, documentId.length()).toString());
                        listOooOO0o2 = arrayList4;
                    } else {
                        listOooOO0o2 = o0OO0O0.OooOO0o(documentId.toString());
                    }
                    if (!listOooOO0o2.isEmpty()) {
                        ListIterator listIterator2 = listOooOO0o2.listIterator(listOooOO0o2.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                break;
                            }
                            if (((String) listIterator2.previous()).length() != 0) {
                                collectionOooo0O0 = o00O0.OooOo00.Oooo0O0(listIterator2.nextIndex() + 1, listOooOO0o2);
                                break;
                            }
                        }
                    }
                    strConcat = ((String[]) collectionOooo0O0.toArray(new String[0]))[1];
                } else {
                    strConcat = null;
                }
            }
        }
        if (strConcat != null) {
            o0000oo02.OooO0OO(strConcat);
            return oooOo;
        }
        o0000oo02.OooO0O0("unknown_path", "Failed to retrieve directory path.");
        return oooOo;
    }
}
