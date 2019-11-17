package inferno.l3v3l_f.client.models;

import inferno.l3v3l_f.common.utils.math.Vector3f;

public class ModelCube extends Model {
    public ModelCube(float x, float y, float z){
        this.vertexes = new Vector3f[] {
                new Vector3f(0f,0f,0f),
                new Vector3f(x, 0f, 0f),
                new Vector3f(x, y, 0f),
                new Vector3f(0f,y,0f),
                new Vector3f(0f, y, z),
                new Vector3f(0f, 0f, z),
                new Vector3f(x, 0f, z),
                new Vector3f(x, y, z)
        };
    }
}
