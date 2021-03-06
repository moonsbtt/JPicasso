
package cn.lmcw.jpicasso.entity;

import io.objectbox.BoxStore;
import io.objectbox.BoxStoreBuilder;
import io.objectbox.ModelBuilder;
import io.objectbox.ModelBuilder.EntityBuilder;
import io.objectbox.model.PropertyFlags;
import io.objectbox.model.PropertyType;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.
/**
 * Starting point for working with your ObjectBox. All boxes are set up for your objects here.
 * <p>
 * First steps (Android): get a builder using {@link #builder()}, call {@link BoxStoreBuilder#androidContext(Object)},
 * and {@link BoxStoreBuilder#build()} to get a {@link BoxStore} to work with.
 */
public class MyObjectBox {

    public static BoxStoreBuilder builder() {
        BoxStoreBuilder builder = new BoxStoreBuilder(getModel());
        builder.entity(UploadImage_.__INSTANCE);
        return builder;
    }

    private static byte[] getModel() {
        ModelBuilder modelBuilder = new ModelBuilder();
        modelBuilder.lastEntityId(2, 3400446868205642268L);
        modelBuilder.lastIndexId(0, 0L);
        modelBuilder.lastRelationId(0, 0L);

        buildEntityUploadImage(modelBuilder);

        return modelBuilder.build();
    }

    private static void buildEntityUploadImage(ModelBuilder modelBuilder) {
        EntityBuilder entityBuilder = modelBuilder.entity("UploadImage");
        entityBuilder.id(2, 3400446868205642268L).lastPropertyId(10, 4741884504030758739L);
        entityBuilder.flags(io.objectbox.model.EntityFlags.USE_NO_ARG_CONSTRUCTOR);

        entityBuilder.property("id", PropertyType.Long).id(1, 3038229316208493892L)
                .flags(PropertyFlags.ID);
        entityBuilder.property("path", PropertyType.String).id(2, 3229401784106173197L);
        entityBuilder.property("fileSize", PropertyType.Long).id(3, 1495930812396770743L)
                .flags(PropertyFlags.NOT_NULL);
        entityBuilder.property("isCompress", PropertyType.Bool).id(4, 3074402911525627203L)
                .flags(PropertyFlags.NOT_NULL);
        entityBuilder.property("creatTime", PropertyType.Long).id(5, 6745237853673772532L)
                .flags(PropertyFlags.NOT_NULL);
        entityBuilder.property("uploaderIp", PropertyType.String).id(6, 7640691944588380444L);
        entityBuilder.property("hash", PropertyType.String).id(7, 350538108557248445L);
        entityBuilder.property("status", PropertyType.String).id(8, 8008937735849373812L);
        entityBuilder.property("attribute", PropertyType.String).id(9, 4576699601035476963L);


        entityBuilder.entityDone();
    }


}
