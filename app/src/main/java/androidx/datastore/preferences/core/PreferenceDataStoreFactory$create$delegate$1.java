package androidx.datastore.preferences.core;

import OoooOOO.o0O00000;
import java.io.File;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import o00O0oO.o000000;
import o00OOOoO.o000O0Oo;

/* loaded from: classes.dex */
public final class PreferenceDataStoreFactory$create$delegate$1 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ OooO0O0 $produceFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$create$delegate$1(OooO0O0 oooO0O0) {
        super(0);
        this.$produceFile = oooO0O0;
    }

    @Override // o00O0Oo.OooO0O0
    public final o000O0Oo invoke() {
        File file = (File) this.$produceFile.invoke();
        OooOo.OooO0o0(file, "<this>");
        String name = file.getName();
        OooOo.OooO0Oo(name, "getName(...)");
        if (o000000.OooooOo('.', name, "").equals(PreferencesSerializer.fileExtension)) {
            String str = o000O0Oo.f32579OooOo0o;
            File absoluteFile = file.getAbsoluteFile();
            OooOo.OooO0Oo(absoluteFile, "file.absoluteFile");
            return o0O00000.OooOO0(absoluteFile);
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
