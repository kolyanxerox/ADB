package androidx.room.migration;

import androidx.sqlite.p003db.SupportSQLiteDatabase;

/* loaded from: classes.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int i, int i2) {
        this.startVersion = i;
        this.endVersion = i2;
    }

    public abstract void migrate(SupportSQLiteDatabase supportSQLiteDatabase);
}
