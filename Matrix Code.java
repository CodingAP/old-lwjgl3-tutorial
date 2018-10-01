public Matrix4f rotateAround(float angle, Vector3f axis) {
		Matrix4f rotate = new Matrix4f();
		
		float x = axis.getX();
		float y = axis.getY();
		float z = axis.getZ();
		
		float sin = (float) Math.sin(Math.toRadians(angle));
        float cos = (float) Math.cos(Math.toRadians(angle));
        float C = 1.0f - cos;
		
		rotate.matrix[0][0] = cos + x * x * C;     rotate.matrix[0][1] = x * y * C - z * sin; rotate.matrix[0][2] = x * z * C + y * sin; rotate.matrix[0][3] = 0;
		rotate.matrix[1][0] = x * y * C + z * sin; rotate.matrix[1][1] = cos + y * y * C;     rotate.matrix[1][2] = y * z * C - x * sin; rotate.matrix[1][3] = 0;
		rotate.matrix[2][0] = x * z * C - y * sin; rotate.matrix[2][1] = y * z * C + x * sin; rotate.matrix[2][2] = cos + z * z * C;     rotate.matrix[2][3] = 0;
		rotate.matrix[3][0] = 0;				   rotate.matrix[3][1] = 0;					  rotate.matrix[3][2] = 0; 				     rotate.matrix[3][3] = 1;
		
		matrix = rotate.getMatrix();
		
		return this;
	}
