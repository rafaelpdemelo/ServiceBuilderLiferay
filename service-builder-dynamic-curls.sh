curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/find-by-h_-d_-n \
-d h7g5folderid=1234 \
-d description="This is where I store all my vacation photos." \
-d name="Vacation" \
-u test@liferay.com:test

curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/find-by-h7-g5-folder-id \
-d h7g5folderid=1234 \
-u test@liferay.com:test

curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/find-by-h7-g5-folder-id \
-d key="1234" \
-u test@liferay.com:test

curl http://localhost:8080/api/jsonws/ohqiwtsfhl.h7g5entry/find-by-h7-g5-folder-id \
-d name="Vacation" \
-u test@liferay.com:test 